import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LRUCache {

    class DLinkedNode {
        int value;
        int key;
        DLinkedNode next;
        DLinkedNode prev;

        DLinkedNode(int value, int key) {
            this.value = value;
            this.key = key;
        }
    }

    private void DInsert(DLinkedNode dl) {
        //DLinkedNode dl = new DLinkedNode(value);
        if (head == null && tail == null) {
            head = tail = dl;
        } else {
            dl.next = head;
            head.prev = dl;
            head = dl;
        }
    }

    private void DDelete(DLinkedNode node) {
        if (tail == null) {
            return;
        } else if (head == tail) {
            head = null;
            tail = null;
        } else if (tail == node) {
            tail = tail.prev;
            tail.next = null;
        } else if (head == node) {
            head = head.next;
            head.prev = null;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node = null;
        }
    }

    private int deleteForCapacity() {
        int key;
        if (head == tail) {
            key = head.key;
            head = null;
            tail = null;
            return key;
        }
        key = tail.key;
        tail = tail.prev;
        tail.next = null;
        return key;
    }
    DLinkedNode head;
    DLinkedNode tail;
    int capacity;
    int size;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
    }

    Map<Integer, DLinkedNode> cache = new HashMap<>();

    public int get(int key) {
        if (cache.containsKey(key)) {
            DLinkedNode node = cache.get(key);
            DDelete(node);
            DInsert(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            DLinkedNode node = cache.get(key);
            node.value = value;
            DDelete(node);
            DInsert(node);
            return;
        }
        if (size == capacity) {
            int deleteKey = deleteForCapacity();
            cache.remove(deleteKey);
            size--;
        }
        DLinkedNode node = new DLinkedNode(value, key);
        DInsert(node);
        cache.put(key, node);
        size++;
    }

    public List<Integer> print() {
        DLinkedNode dl = head;
        List<Integer> values = new ArrayList<>();
        while (dl != null) {
            values.add(dl.value);
            dl = dl.next;
        }
        return values;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */