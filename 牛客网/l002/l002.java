package NowCoder.l002;

public class l002 {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode middle = getLatter(head);
        ListNode left = head;
        ListNode right = middle.next;
        middle.next = null;
        right = reverseList(right);
        mergeTwoList(left, right);
    }

    public ListNode getLatter(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        return pre;
    }

    public void mergeTwoList(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            ListNode l1_tmp = l1.next;
            ListNode l2_tmp = l2.next;
            l1.next = l2;
            l1 = l1_tmp;
            l2.next = l1;
            l2 = l2_tmp;
        }
    }
}
