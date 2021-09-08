package SuanFa.l109;

import SuanFa.TreeNode;
import SuanFa.ListNode;

public class l109 {

    public TreeNode sortedListToBST(ListNode head) {
        return BST(head, null);
    }

    public TreeNode BST(ListNode left, ListNode right) {
        if (left == right) {
            return null;
        }
        ListNode mid = getMid(left, right);
        TreeNode root = new TreeNode(mid.val);
        root.left = BST(left, mid);
        root.right = BST(mid.next, right);
        return root;
    }

    public ListNode getMid(ListNode left, ListNode right) {
        ListNode fast = left;
        ListNode slow = left;
        while (fast != right && fast.next != right) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
