package SuanFa.l061;

import SuanFa.ListNode;

public class l061 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        ListNode curr = head;
        int len = 1;
        while (curr.next != null) {
            len++;
            curr = curr.next;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }
        curr.next = head;
        curr = head;
        for (int i = 0;i < len-k-1;i++) {
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;
        return head;
    }
}
