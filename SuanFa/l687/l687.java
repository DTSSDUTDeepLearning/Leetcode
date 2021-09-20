package SuanFa.l687;

import SuanFa.TreeNode;

public class l687 {

    int result;

    public int longestUnivaluePath(TreeNode root) {
        result = 0;
        arrow(root);
        return result;
    }

    public int arrow(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = arrow(root.left);
        int right = arrow(root.right);
        int arrowLeft = 0;
        int arrowRight = 0;
        if (root.left != null && root.left.val == root.val) {
            arrowLeft += left+1;
        }
        if (root.right != null && root.right.val == root.val) {
            arrowRight += right+1;
        }
        result = Math.max(result, arrowLeft+arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }
}
