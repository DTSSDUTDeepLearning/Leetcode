package SuanFa.l965;

import SuanFa.TreeNode;

public class l965 {

    public boolean isUnivalTree(TreeNode root) {
        int v = root.val;
        return check(root, v);
    }

    public boolean check(TreeNode root, int v) {
        if (root.val != v) {
            return false;
        }
        if (root.left == null) {
            if (root.right == null) {
                return true;
            }
            else {
                return check(root.right, v);
            }
        }
        else {
            if (root.right == null) {
                return check(root.left, v);
            }
            else {
                return check(root.left, v) && check(root.right, v);
            }
        }
    }
}
