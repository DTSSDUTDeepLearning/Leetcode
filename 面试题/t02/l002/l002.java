package MianShiTi.t02.l002;

import MianShiTi.t02.ListNode;

public class l002 {

    public int kthToLast(ListNode head, int k) {
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        for (int i = 0;i < len-k;i++) {
            head = head.next;
        }
        return head.val;
    }
}
