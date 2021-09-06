package SuanFa.l019;

import SuanFa.ListNode;

public class l019 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prehead = new ListNode(0);
        prehead.next = head;
        ListNode first = prehead;
        ListNode second = prehead;
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return prehead.next;
    }
}
