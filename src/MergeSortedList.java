import java.util.LinkedList;
import java.util.List;

public class MergeSortedList {
    /*public void insertNode(ListNode head, ListNode tail,int val){
        if(head == null && tail == null){
            head = tail = new ListNode(val);
        }
        else {
            tail.next = new ListNode(val);
        }
    }*/
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null,tail = null,temp = null;
        if(l1 == null&& l2 == null)
            return null;
        else if(l1 == null)
            return l2;
        else if (l2 == null)return l1;
        if(l1.val<l2.val){
            head = tail = new ListNode(l1.val);
            temp = l1;
            l1 = l1.next;
            temp.next = null;
        }
        else {
            head = tail = new ListNode(l2.val);
            temp = l2;
            l2 = l2.next;
            temp.next = null;
        }
        while(l1 != null || l2 != null) {
            if(l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    tail.next =  new ListNode(l1.val);
                    tail = tail.next;
                    temp = l1;
                    l1 = l1.next;
                    temp.next = null;
                } else if (l1.val > l2.val) {
                    tail.next =  new ListNode(l2.val);
                    tail = tail.next;
                    temp = l2;
                    l2 = l2.next;
                    temp.next = null;
                } else {
                    tail.next = new ListNode(l1.val);
                    tail = tail.next;
                    temp = l1;
                    l1 = l1.next;
                    temp.next = null;
                    tail.next =  new ListNode(l2.val);
                    tail = tail.next;
                    temp = l2;
                    l2 = l2.next;
                    temp.next = null;
                }
            } else if(l1 != null){
                tail.next = new ListNode(l1.val);
                tail = tail.next;
                temp = l1;
                l1 = l1.next;
                temp.next = null;
            } else if(l2 != null){
                tail.next =  new ListNode(l2.val);
                tail = tail.next;
                temp = l2;
                l2 = l2.next;
                temp.next = null;
            }
        }
        return head;
    }
}
