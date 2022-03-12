package SuanFa.l1448;

import SuanFa.TreeNode;

public class l1448 {

    int cnt;

    public int goodNodes(TreeNode root) {
        cnt = 1;
        dfs(root.left, root.val);
        dfs(root.right, root.val);
        return cnt;
    }

    public void dfs(TreeNode root, int max) {
        if (root == null) {
            return;
        }
        if (root.val >= max) {
            cnt++;
            max = root.val;
        }
        dfs(root.left, max);
        dfs(root.right, max);
    }
}
