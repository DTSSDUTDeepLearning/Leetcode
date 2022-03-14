package SuanFa.l1721;

import SuanFa.ListNode;

public class l1721 {

    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        ListNode pre_left = new ListNode(-1);
        pre_left.next = head;
        int len = 0;
        for (int i = 1;i < k;i++) {
            pre_left = pre_left.next;
            curr = curr.next;
            len++;
        }
        while (curr != null) {
            curr = curr.next;
            len++;
        }
        if (len == 1) {
            return head;
        }
        if (len == 2) {
            ListNode right = head.next;
            head.next = null;
            right.next = head;
            return right;
        }
        if (k == 1 || k == len) {
            curr = head;
            ListNode pre_right = new ListNode(-1);
            pre_right.next = head;
            while (curr.next != null) {
                curr = curr.next;
                pre_right = pre_right.next;
            }
            ListNode left_next = head.next;
            head.next = null;
            pre_right.next = head;
            curr.next = left_next;
            return curr;
        }
        if (len % 2 == 1 && 2 * k - 1 == len) {
            return head;
        }
        if (2 * k == len) {
            curr = pre_left.next;
            pre_left.next = curr.next;
            curr.next = curr.next.next;
            pre_left.next.next = curr;
            return head;
        }
        if (2 * (k - 1) == len) {
            curr = head;
            pre_left = new ListNode(-1);
            pre_left.next = head;
            for (int i = 1;i < k-1;i++) {
                pre_left = pre_left.next;
                curr = curr.next;
            }
            pre_left.next = curr.next;
            curr.next = curr.next.next;
            pre_left.next.next = curr;
            return head;
        }
        curr = head;
        ListNode pre_right = new ListNode(-1);
        pre_right.next = head;
        for (int i = 0;i < len-k;i++) {
            pre_right = pre_right.next;
            curr = curr.next;
        }
        if (2 * k > len) {
            ListNode tmp = pre_left;
            pre_left = pre_right;
            pre_right = tmp;
        }
        ListNode left = pre_left.next;
        ListNode right = pre_right.next;
        ListNode left_next = left.next;
        left.next = right.next;
        pre_right.next = left;
        pre_left.next = right;
        right.next = left_next;
        return head;
    }
}
