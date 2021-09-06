package SuanFa.l023;

import SuanFa.ListNode;

public class l023 {

    public static ListNode mergetwo(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        ListNode curr1 = head1;
        ListNode curr2 = head2;
        ListNode head3 = new ListNode();
        if (curr1.val < curr2.val) {
            head3.val = curr1.val;
            curr1 = curr1.next;
        }
        else {
            head3.val = curr2.val;
            curr2 = curr2.next;
        }
        ListNode curr3 = head3;
        while (curr1 != null && curr2 != null) {
            if (curr1.val < curr2.val) {
                curr3.next = curr1;
                curr1 = curr1.next;
            }
            else {
                curr3.next = curr2;
                curr2 = curr2.next;
            }
            curr3 = curr3.next;
        }
        if (curr1 == null) {
            curr3.next = curr2;
        }
        else {
            curr3.next = curr1;
        }
        return head3;
    }

    public static ListNode merge(ListNode[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }
        if (left == right-1) {
            return mergetwo(lists[left], lists[right]);
        }
        return mergetwo(merge(lists, left, (left+right)/2), merge(lists, (left+right)/2+1, right));
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return merge(lists, 0, lists.length-1);
    }

    public static void main(String[] args) {

    }
}
