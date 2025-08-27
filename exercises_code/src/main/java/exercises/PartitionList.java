package exercises;

public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;

        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);
        ListNode b = before, a = after;

        while (head != null) {
            if (head.val < x) {
                b.next = new ListNode(head.val); 
                b = b.next;
            } else {
                a.next = new ListNode(head.val);
                a = a.next;
            }
            head = head.next;
        }

        b.next = after.next;
        return before.next;
    }
}
