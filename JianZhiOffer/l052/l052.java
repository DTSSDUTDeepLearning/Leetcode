package JianZhiOffer.l052;

public class l052 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode currA = headA;
        ListNode currB = headB;
        for (int i = 1;i <= 2;i++) {
            while (currA != null && currB != null) {
                currA = currA.next;
                currB = currB.next;
            }
            if (currA == null) {
                currA = headB;
            }
            else {
                currB = headA;
            }
        }
        while (currA != null && currB != null && currA != currB) {
            currA = currA.next;
            currB = currB.next;
        }
        return currA;
    }
}
