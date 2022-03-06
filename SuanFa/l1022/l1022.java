package SuanFa.l1022;

import SuanFa.TreeNode;

public class l1022 {

    public int sumRootToLeaf(TreeNode root) {
        return leaf(root, 0);
    }

    public int leaf(TreeNode root, int now) {
        if (root == null) {
            return 0;
        }
        now = now << 1 + root.val;
        if (root.left == null && root.right == null) {
            return now;
        }
        return leaf(root.left, now)+leaf(root.right, now);
    }
}
