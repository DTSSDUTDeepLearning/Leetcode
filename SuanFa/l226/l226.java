package SuanFa.l226;

import SuanFa.TreeNode;

public class l226 {

    public static void invert(TreeNode root) {
        if (root.left == null) {
            if (root.right == null) {
                return;
            }
            else {
                root.left = root.right;
                root.right = null;
                invert(root.left);
            }
        }
        else {
            if (root.right == null) {
                root.right = root.left;
                root.left = null;
                invert(root.right);
            }
            else {
                TreeNode tmp = root.left;
                root.left = root.right;
                root.right = tmp;
                invert(root.left);
                invert(root.right);
            }
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            invert(root);
        }
        return root;
    }
}
