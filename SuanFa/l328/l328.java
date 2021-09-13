package SuanFa.l328;

import SuanFa.ListNode;

public class l328 {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode second = even;
        while (even.next != null && even.next.next != null) {
            odd.next = even.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        if (even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = null;
        }
        odd.next = second;
        return head;
    }
}
