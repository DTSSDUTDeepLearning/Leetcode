package SuanFa.l024;

import SuanFa.ListNode;

public class l024 {

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr1 = head;
        ListNode curr2 = head.next;
        curr1.next = curr2.next;
        curr2.next = curr1;
        head = curr2;
        ListNode before = curr1;
        if (before.next == null) {
            return head;
        }
        curr1 = before.next;
        if (curr1.next == null) {
            return head;
        }
        curr2 = curr1.next;
        while (true) {
            curr1.next = curr2.next;
            curr2.next = curr1;
            before.next = curr2;
            before = curr1;
            if (before.next == null) {
                return head;
            }
            curr1 = before.next;
            if (curr1.next == null) {
                return head;
            }
            curr2 = curr1.next;
        }
    }

}
