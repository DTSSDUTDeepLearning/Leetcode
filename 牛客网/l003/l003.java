package NowCoder.l003;

public class l003 {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null || pHead.next.next == null) {
            return null;
        }
        ListNode tortoise = pHead;
        ListNode rabbit = pHead;
        while (rabbit != null) {
            tortoise = tortoise.next;
            if (rabbit.next == null) {
                return null;
            }
            rabbit = rabbit.next.next;
            if (tortoise == rabbit) {
                ListNode ptr = pHead;
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
