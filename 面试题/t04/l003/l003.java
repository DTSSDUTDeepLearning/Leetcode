package MianShiTi.t04.l003;

import MianShiTi.t04.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l003 {

    public ListNode[] listOfDepth(TreeNode tree) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(tree);
        List<ListNode> l = new LinkedList<>();
        while (!q.isEmpty()) {
            ListNode pre_head = new ListNode(-1);
            ListNode curr = pre_head;
            int len = q.size();
            for (int i = 0;i < len;i++) {
                tree = q.poll();
                curr.next = new ListNode(tree.val);
                curr = curr.next;
                if (tree.left != null) {
                    q.offer(tree.left);
                }
                if (tree.right != null) {
                    q.offer(tree.right);
                }
            }
            l.add(pre_head.next);
        }
        int len = l.size();
        ListNode[] result = new ListNode[len];
        for (int i = 0;i < len;i++) {
            result[i] = l.get(i);
        }
        return result;
    }
}
