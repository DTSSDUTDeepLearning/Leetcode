package NowCoder.l066;

public class l066 {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode currA = pHead1;
        ListNode currB = pHead2;
        for (int i = 1;i <= 2;i++) {
            while (currA != null && currB != null) {
                currA = currA.next;
                currB = currB.next;
            }
            if (currA == null) {
                currA = pHead2;
            }
            else {
                currB = pHead1;
            }
        }
        while (currA != null && currB != null && currA != currB) {
            currA = currA.next;
            currB = currB.next;
        }
        return currA;
    }
}
