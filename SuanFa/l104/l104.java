package SuanFa.l104;

import SuanFa.TreeNode;

public class l104 {

    public static int nowDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        return Math.max(nowDepth(root.left, depth+1), nowDepth(root.right, depth+1));
    }

    public int maxDepth(TreeNode root) {
        return nowDepth(root, 0);
    }
}
