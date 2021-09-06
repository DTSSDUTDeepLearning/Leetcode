package SuanFa.l002;

import SuanFa.ListNode;

public class l002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tmp = 0;
        ListNode head = l1;
        ListNode pre = new ListNode(-1);
        pre.next = l1;
        while (l1 != null && l2 != null) {
            int s = l1.val + l2.val + tmp;
            l1.val = s % 10;
            tmp = s > 9 ? 1 : 0;
            l1 = l1.next;
            pre = pre.next;
            l2 = l2.next;
        }
        if (l2 != null) {
            pre.next = l2;
            l1 = pre.next;
        }
        while (l1 != null) {
            if (tmp == 1) {
                if (l1.val == 9) {
                    l1.val = 0;
                }
                else {
                    l1.val++;
                    tmp = 0;
                }
            }
            l1 = l1.next;
            pre = pre.next;
        }
        if (tmp == 1) {
            pre.next = new ListNode(1);
        }
        return head;
    }
}
