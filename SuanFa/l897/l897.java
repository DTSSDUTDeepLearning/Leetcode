package SuanFa.l897;

import SuanFa.TreeNode;

public class l897 {

    TreeNode curr;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode pre_root = new TreeNode();
        curr = pre_root;
        in(root);
        return pre_root.right;
    }

    public void in(TreeNode root) {
        if (root == null) {
            return;
        }
        in(root.left);
        curr.right = root;
        root.left = null;
        curr = root;
        in(root.right);
    }
}
