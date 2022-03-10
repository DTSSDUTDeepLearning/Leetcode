package SuanFa.l1315;

import SuanFa.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class l1315_1 {

    // 广度优先遍历
//    执行用时：9 ms, 在所有 Java 提交中击败了8.73%的用户
//    内存消耗：39.6 MB, 在所有 Java 提交中击败了90.19%的用户
    public int sumEvenGrandparent(TreeNode root) {
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int sum = 0;
        while (!q.isEmpty()) {
            TreeNode node = q.pop();
            if (node.val % 2 == 0) {
                if (node.left != null) {
                    q.offer(node.left);
                    if (node.left.left != null) {
                        sum+=node.left.left.val;
                    }
                    if (node.left.right != null) {
                        sum+=node.left.right.val;
                    }
                }
                if (node.right != null) {
                    q.offer(node.right);
                    if (node.right.left != null) {
                        sum+=node.right.left.val;
                    }
                    if (node.right.right != null) {
                        sum+=node.right.right.val;
                    }
                }
            }
            else {
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
        }
        return sum;
    }
}
