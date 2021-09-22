package SuanFa.l701;

import SuanFa.TreeNode;

public class l701 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode tmp = root;
        while (true) {
            if (tmp.val > val) {
                if (tmp.left == null) {
                    tmp.left = new TreeNode(val);
                    break;
                }
                else {
                    tmp = tmp.left;
                }
            }
            else {
                if (tmp.right == null) {
                    tmp.right = new TreeNode(val);
                    break;
                }
                else {
                    tmp = tmp.right;
                }
            }
        }
        return root;
    }
}
