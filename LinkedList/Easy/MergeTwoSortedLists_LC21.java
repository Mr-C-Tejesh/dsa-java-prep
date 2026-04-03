package LinkedList.Easy;

public class MergeTwoSortedLists_LC21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode slist = new ListNode(0);
        ListNode curr = slist;
        ListNode c1 = list1; ListNode c2=list2;
        while((c1 != null)&&(c2!=null)) {
            if (c1.val > c2.val){
                curr.next = c2;
                c2 = c2.next;
                curr = curr.next;
            }
            else {
                curr.next = c1;
                c1 = c1.next;
                curr = curr.next;
            }
        }
        while(c1 != null){
            curr.next = c1;
            c1 = c1.next;
            curr = curr.next;
        }
        while(c2 != null){
            curr.next = c2;
            c2 = c2.next;
            curr = curr.next;
        }
        return slist.next;
    }
}
