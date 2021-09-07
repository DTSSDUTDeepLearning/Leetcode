package SuanFa.l082;

import SuanFa.ListNode;

public class l082 {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre_head = new ListNode(-1);
        ListNode cur = pre_head;
        pre_head.next = head;
        while (head != null && head.next != null) {
            int v = head.val;
            boolean flag = true;
            if (head.next.val == v) {
                flag = false;
                while (head.next != null && head.next.val == v) {
                    head.next = head.next.next;
                }
            }
            if (flag) {
                cur = cur.next;
                head = head.next;
            }
            else {
                head = head.next;
                cur.next = head;
            }
        }
        return pre_head.next;
    }
}
