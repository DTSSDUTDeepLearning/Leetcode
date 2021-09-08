package SuanFa.l147;

import SuanFa.ListNode;

public class l147 {

    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr_pre = head;
        ListNode curr = head.next;
        while (curr != null) {
            ListNode pre = dummy;
            ListNode last = pre.next;
            while (last != curr && last.val <= curr.val) {
                pre = last;
                last = last.next;
            }
            if (last != curr) {
                curr_pre.next = curr.next;
                pre.next = curr;
                curr.next = last;
                curr = curr_pre.next;
            }
            else {
                curr_pre = curr;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
