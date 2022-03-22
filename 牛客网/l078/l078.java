package NowCoder.l078;

public class l078 {

    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        ListNode nex = null;
        while (curr != null) {
            nex = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nex;
        }
        return pre;
    }
}
