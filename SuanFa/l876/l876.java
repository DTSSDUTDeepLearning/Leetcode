package SuanFa.l876;

import SuanFa.ListNode;

public class l876 {

    public ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        for (int i = 0;i < len/2;i++) {
            head = head.next;
        }
        return head;
    }
}
