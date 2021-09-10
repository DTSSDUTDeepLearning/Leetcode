package SuanFa.l234;

import SuanFa.ListNode;

public class l234 {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        ListNode firstEnd = middleNode(head);
        ListNode secondBegin = reverse(firstEnd.next);

        while (secondBegin != null) {
            if (head.val != secondBegin.val) {
                return false;
            }
            head = head.next;
            secondBegin = secondBegin.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
