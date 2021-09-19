package SuanFa.l623;

import SuanFa.TreeNode;

public class l623 {

    int val;
    int depth;

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode result = new TreeNode(val);
            result.left = root;
            return result;
        }
        this.val = val;
        this.depth = depth;
        dfs(root, 1);
        return root;
    }

    public void dfs(TreeNode root, int d) {
        if (root == null) {
            return;
        }
        if (d + 1 == depth) {
            TreeNode l = new TreeNode(val);
            l.left = root.left;
            root.left = l;
            TreeNode r = new TreeNode(val);
            r.right = root.right;
            root.right = r;
        }
        else {
            dfs(root.left, d+1);
            dfs(root.right, d+1);
        }
    }
}
