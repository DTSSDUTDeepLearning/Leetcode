package MianShiTi.t04.l005;

import MianShiTi.t04.TreeNode;

public class l005 {

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isValid(root, (long)Integer.MIN_VALUE-1, (long)Integer.MAX_VALUE+1);
    }

    public boolean isValid(TreeNode root, long left, long right) {
        if (root.val < left || root.val > right) {
            return false;
        }
        if (root.left == null) {
            if (root.right == null) {
                return true;
            }
            else {
                return root.right.val < right && isValid(root.right, root.val, right);
            }
        }
        else {
            if (root.right == null) {
                return root.left.val > left && isValid(root.left, left, root.val);
            }
            else {
                return root.left.val > left && isValid(root.left, left, root.val) && root.right.val < right && isValid(root.right, root.val, right);
            }
        }
    }
}
