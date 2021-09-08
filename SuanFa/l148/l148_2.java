package SuanFa.l148;

import SuanFa.ListNode;

public class l148_2 {

    // 自底向上，使用递归排序，需要O(1)的空间。但时间复杂度是比较高的
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return head;
        }
        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        ListNode pre_head = new ListNode(0, head);
        for (int subLength = 1;subLength < len;subLength*=2) {
            ListNode prev = pre_head;
            curr = pre_head.next;
            while (curr != null) {
                ListNode head1 = curr;
                for (int i = 1;i < subLength && curr.next != null;i++) {
                    curr = curr.next;
                }
                ListNode head2 = curr.next;
                curr.next = null;
                curr = head2;
                for (int i = 1;i < subLength && curr != null && curr.next != null;i++) {
                    curr = curr.next;
                }
                ListNode next = null;
                if (curr != null) {
                    next = curr.next;
                    curr.next = null;
                }
                prev.next = merge(head1, head2);
                while (prev.next != null) {
                    prev = prev.next;
                }
                curr = next;
            }
        }
        return pre_head.next;
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode pre_head = new ListNode();
        ListNode curr;
        if (l1.val <= l2.val) {
            curr = l1;
            l1 = l1.next;
        }
        else {
            curr = l2;
            l2 = l2.next;
        }
        pre_head.next = curr;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            }
            else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 == null) {
            curr.next = l2;
        }
        else {
            curr.next = l1;
        }
        return pre_head.next;
    }
}
