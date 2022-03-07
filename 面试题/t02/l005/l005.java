package MianShiTi.t02.l005;

import MianShiTi.t02.ListNode;

public class l005 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1 = 0;
        int len2 = 0;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        while (cur1 != null) {
            len1++;
            cur1 = cur1.next;
        }
        while (cur2 != null) {
            len2++;
            cur2 = cur2.next;
        }
        if (len1 >= len2) {
            return add(l1, l2, len1, len2);
        }
        else {
            return add(l2, l1, len2, len1);
        }
    }

    public ListNode add(ListNode l1, ListNode l2, int len1, int len2) {
        ListNode pre_sum = new ListNode(-1);
        ListNode sum = pre_sum;
        int tmp = 0;
        for (int i = 0;i < len2;i++) {
            int s = l1.val + l2.val + tmp;
            sum.next = new ListNode(s % 10);
            tmp = s > 9 ? 1 : 0;
            sum = sum.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        for (int i = len2;i < len1;i++) {
            int s = l1.val + tmp;
            sum.next = new ListNode(s % 10);
            tmp = s > 9 ? 1 : 0;
            sum = sum.next;
            l1 = l1.next;
        }
        if (tmp == 1) {
            sum.next = new ListNode(1);
        }
        return pre_sum.next;
    }
}
