package NowCoder.l060;

import java.util.LinkedList;
import java.util.Queue;

public class l060 {

    public boolean[] judgeIt (TreeNode root) {
        if (root == null) {
            return new boolean[]{true, true};
        }
        else {
            return new boolean[]{isSearch(root, Integer.MIN_VALUE, Integer.MAX_VALUE), isWanquan(root)};
        }
    }

    public boolean isSearch(TreeNode root, int down, int up) {
        if (root.left == null) {
            if (root.right == null) {
                return root.val > down && root.val < up;
            }
            else {
                return isSearch(root.right, root.val, up);
            }
        }
        else {
            if (root.right == null) {
                return isSearch(root.left, down, root.val);
            }
            else {
                return isSearch(root.left, down, root.val) && isSearch(root.right, root.val, up);
            }
        }
    }

    public boolean isWanquan(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (q.peek() != null) {
            TreeNode node = q.poll();
            q.offer(node.left);
            q.offer(node.right);
        }
        while (!q.isEmpty() && q.peek() == null) {
            q.poll();
        }
        return q.isEmpty();
    }
}
