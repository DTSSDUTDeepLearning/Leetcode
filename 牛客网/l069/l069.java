package NowCoder.l069;

public class l069 {

    public ListNode FindKthToTail (ListNode pHead, int k) {
        int len = 0;
        ListNode curr = pHead;
        while (curr != null) {
            curr = curr.next;
            len++;
        }
        if (k > len) {
            return null;
        }
        for (int i = 0;i < len-k;i++) {
            pHead = pHead.next;
        }
        return pHead;
    }
}
