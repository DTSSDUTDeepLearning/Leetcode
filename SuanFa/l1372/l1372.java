package SuanFa.l1372;

import SuanFa.TreeNode;

public class l1372 {

    int maxdep;

    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }
        maxdep = 0;
        dfs(root, true, 0);
        dfs(root, false, 0);
        return maxdep;
    }

    public void dfs(TreeNode root, boolean dir, int dep) {
        maxdep = Math.max(maxdep, dep);
        if (dir) {
            if (root.right != null) {
                dfs(root.right, false, dep+1);
            }
            if (root.left != null) {
                dfs(root.left, true, 1);
            }
        }
        else {
            if (root.left != null) {
                dfs(root.left, true, dep+1);
            }
            if (root.right != null) {
                dfs(root.right, false, 1);
            }
        }
    }
}
