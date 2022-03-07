package MianShiTi.t02.l008;

import MianShiTi.t02.ListNode;

public class l008 {

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        if (head.next == head) {
            return head;
        }
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast != null && fast.next != null && fast != slow) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast == slow) {
            fast = head;
            while (fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
            return fast;
        }
        else {
            return null;
        }
    }
}
