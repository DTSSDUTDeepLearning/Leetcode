package SuanFa.l235;

import SuanFa.TreeNode;

public class l235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            return search(root, q, p);
        }
        else {
            return search(root, p, q);
        }
    }

    public TreeNode search(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val == root.val || q.val == root.val || p.val < root.val && q.val > root.val) {
            return root;
        }
        else if (q.val < root.val) {
            return search(root.left, p, q);
        }
        else {
            return search(root.right, p, q);
        }
    }
}
