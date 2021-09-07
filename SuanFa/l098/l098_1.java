package SuanFa.l098;

import SuanFa.TreeNode;

public class l098_1 {

    // 递归
    public boolean isValidBST(TreeNode root) {
        return isBST(root, Integer.MIN_VALUE-1, Integer.MAX_VALUE+1);
    }

    public boolean isBST(TreeNode root, long down, long up) {
        if (root == null) {
            return true;
        }
        if (root.val <= down || root.val >= up) {
            return false;
        }
        else {
            return isBST(root.left, down, root.val) && isBST(root.right, root.val, up);
        }
    }
}
