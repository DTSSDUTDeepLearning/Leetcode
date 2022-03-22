package NowCoder.l070;

public class l070 {

    public ListNode sortInList (ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        return partition(head);
    }

    public ListNode partition(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        ListNode left = partition(head);
        ListNode right = partition(head2);
        return merge(left, right);
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode pre_head = new ListNode();
        ListNode curr;
        if (l1.val >= l2.val) {
            curr = l1;
            l1 = l1.next;
        }
        else {
            curr = l2;
            l2 = l2.next;
        }
        pre_head.next = curr;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            }
            else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 == null) {
            curr.next = l2;
        }
        else {
            curr.next = l1;
        }
        return pre_head.next;
    }
}
