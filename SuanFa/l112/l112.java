package SuanFa.l112;

import SuanFa.TreeNode;

public class l112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null) {
            if (root.right == null) {
                return (sum==root.val);
            }
            else {
                return hasPathSum(root.right, sum-root.val);
            }
        }
        else {
            if (root.right == null) {
                return hasPathSum(root.left, sum-root.val);
            }
            else {
                return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
            }
        }
    }

}
