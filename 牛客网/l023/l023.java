package NowCoder.l023;

public class l023 {

    public ListNode partition (ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode small_pre = new ListNode(-1);
        ListNode small_curr = small_pre;
        ListNode large_pre = new ListNode(-1);
        ListNode large_curr = large_pre;
        while (head != null) {
            if (head.val < x) {
                small_curr.next = new ListNode(head.val);
                small_curr = small_curr.next;
            }
            else {
                large_curr.next = new ListNode(head.val);
                large_curr = large_curr.next;
            }
            head = head.next;
        }
        small_curr.next = large_pre.next;
        return small_pre.next;
    }
}
