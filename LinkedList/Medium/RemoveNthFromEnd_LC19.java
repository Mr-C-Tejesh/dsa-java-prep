package LinkedList.Medium;

public class RemoveNthFromEnd_LC19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = head;
        for(int i=1;i<=n;i++) {
            fast = fast.next;
        }
        ListNode slow = dummy; 
        while(fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
