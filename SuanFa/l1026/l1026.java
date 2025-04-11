package l1026;

import java.util.Map;

public class l1026 {

    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    public int dfs(TreeNode root, int min, int max) {
        if (root == null) {
            return 0;
        }
        int result = Math.max(Math.abs(root.val-min), Math.abs(root.val-max));
        min = Math.min(root.val, min);
        max = Math.max(root.val, max);
        result = Math.max(result, dfs(root.left, min, max));
        result = Math.max(result, dfs(root.right, min, max));
        return result;
    }
}
