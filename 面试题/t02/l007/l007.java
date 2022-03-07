package MianShiTi.t02.l007;

import MianShiTi.t02.ListNode;

public class l007 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;
        while (currA != null && currB != null) {
            currA = currA.next;
            currB = currB.next;
        }
        if (currA == null) {
            return find(headB, headA, currB);
        }
        else {
            return find(headA, headB, currA);
        }
    }

    public ListNode find(ListNode longHead, ListNode shortHead, ListNode longCurr) {
        ListNode shortCurr = longHead;
        while (shortCurr != null && longCurr != null) {
            shortCurr = shortCurr.next;
            longCurr = longCurr.next;
        }
        if (shortCurr == null) {
            return null;
        }
        else {
            longCurr = shortHead;
            while (shortCurr != longCurr) {
                shortCurr = shortCurr.next;
                longCurr = longCurr.next;
            }
            return shortCurr;
        }
    }
}
