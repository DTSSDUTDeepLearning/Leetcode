package SuanFa.l092;

import SuanFa.ListNode;

public class l092 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prehead = new ListNode(-1);
        prehead.next = head;
        ListNode pre = prehead;
        for (int i = 0;i < left-1;i++) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        ListNode nex = cur.next;
        for (int i = 0;i < right-left;i++) {
            nex = cur.next;
            cur.next = nex.next;
            nex.next = pre.next;
            pre.next = nex;
        }
        return prehead.next;
    }
}
