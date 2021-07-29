package SuanFa.l025;

public class l025 {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int len = 1;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }
        int times = len / k;
        ListNode pre_head = new ListNode();
        pre_head.next = head;
        for (int i = 0;i < times;i++) {
            reverseBetween(pre_head, i*k+2, (i+1)*k+1);
        }
        return pre_head.next;
    }

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
