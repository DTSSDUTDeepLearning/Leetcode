package SuanFa.l142;

import SuanFa.ListNode;

public class l142 {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode tortoise = head;
        ListNode rabbit = head;
        while (rabbit != null) {
            tortoise = tortoise.next;
            if (rabbit.next == null) {
                return null;
            }
            rabbit = rabbit.next.next;
            if (tortoise == rabbit) {
                ListNode ptr = head;
                while (ptr != tortoise) {
                    ptr = ptr.next;
                    tortoise = tortoise.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
