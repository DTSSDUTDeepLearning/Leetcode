package NowCoder.l021;

public class l021 {

    public ListNode reverseBetween (ListNode head, int m, int n) {
        ListNode prehead = new ListNode();
        prehead.next = head;
        ListNode pre = prehead;
        for (int i = 0;i < m-1;i++) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        for (int i = 0;i < n-m;i++) {
            ListNode nex = cur.next;
            cur.next = nex.next;
            nex.next = pre.next;
            pre.next = nex;
        }
        return prehead.next;
    }
}
