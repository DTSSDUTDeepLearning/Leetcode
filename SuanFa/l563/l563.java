package SuanFa.l563;

import SuanFa.TreeNode;

public class l563 {

    int sumTilt;

    public int findTilt(TreeNode root) {
        sumTilt = 0;
        dfs(root);
        return sumTilt;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        sumTilt += Math.abs(left - right);
        return left + right + root.val;
    }
}
