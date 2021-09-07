package SuanFa.l086;

import SuanFa.ListNode;

public class l086 {

    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode smallhead = small;
        ListNode largehead = large;
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            }
            else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        large.next = null;
        small.next = largehead.next;
        return smallhead.next;
    }
}
