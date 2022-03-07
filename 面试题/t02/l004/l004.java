package MianShiTi.t02.l004;

import MianShiTi.t02.ListNode;

public class l004 {

    public ListNode partition(ListNode head, int x) {
        ListNode pre_small = new ListNode(-1);
        ListNode pre_big = new ListNode(-1);
        ListNode curr_small = pre_small;
        ListNode curr_big = pre_big;
        while (head != null) {
            if (head.val < x) {
                curr_small.next = new ListNode(head.val);
                curr_small = curr_small.next;
            }
            else {
                curr_big.next = new ListNode(head.val);
                curr_big = curr_big.next;
            }
            head = head.next;
        }
        curr_small.next = pre_big.next;
        return pre_small.next;
    }
}
