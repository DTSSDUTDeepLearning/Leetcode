package NowCoder.l051;

import java.util.ArrayList;
import java.util.List;

public class l051 {

    public static ListNode mergeTwo(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
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
        return head.next;
    }

    public static ListNode mergeK(List<ListNode> lists, int left, int right) {
        if (left == right) {
            return lists.get(left);
        }
        if (left == right-1) {
            return mergeTwo(lists.get(left), lists.get(right));
        }
        return mergeTwo(mergeK(lists, left, left+(right-left)/2), mergeK(lists, left+(right-left)/2+1, right));
    }

    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists.size() == 0) {
            return null;
        }
        return mergeK(lists, 0, lists.size()-1);
    }
}
