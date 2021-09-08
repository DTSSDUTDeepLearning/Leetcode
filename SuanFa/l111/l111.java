package SuanFa.l111;

import SuanFa.TreeNode;

public class l111 {

    public static int nowDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        if (root.left == null) {
            return nowDepth(root.right, depth+1);
        }
        if (root.right == null) {
            return nowDepth(root.left, depth+1);
        }
        return Math.min(nowDepth(root.left, depth+1), nowDepth(root.right, depth+1));
    }

    public int minDepth(TreeNode root) {
        return nowDepth(root, 0);
    }
}
