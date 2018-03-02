public class ReverseLinklist {
    public ListNode reverseList(ListNode head) {
        ListNode ptr,ptr2;
        ptr = head.next;
        ptr2 = ptr.next;
        head.next = null;
        while(ptr2.next!= null){
            ptr.next = head;
            head = ptr;
            ptr = ptr2;
            ptr2 = ptr2.next;
        }
        ptr.next = head;
        ptr2.next = ptr;
        head = ptr2;
        return head;
    }
}
