package SuanFa.l141;

import SuanFa.ListNode;

public class l141 {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode tortoise = head;
        ListNode rabbit = head.next;
        while (tortoise != rabbit) {
            if (rabbit == null || rabbit.next == null) {
                return false;
            }
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;
        }
        return true;
    }
}
