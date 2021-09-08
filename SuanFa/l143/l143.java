package SuanFa.l143;

import SuanFa.ListNode;

public class l143 {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode middle = find_mid(head);
        ListNode left = head;
        ListNode right = middle.next;
        middle.next = null;
        right = reverseList(right);
        mergeTwoList(left, right);
    }

    public ListNode find_mid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nex = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nex;
        }
        return pre;
    }

    public void mergeTwoList(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            ListNode l1_tmp = l1.next;
            ListNode l2_tmp = l2.next;
            l1.next = l2;
            l1 = l1_tmp;
            l2.next = l1;
            l2 = l2_tmp;
        }
    }
}
