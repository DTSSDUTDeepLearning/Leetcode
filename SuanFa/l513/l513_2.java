package SuanFa.l513;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class l513_2 {

    // 深度优先遍历
//    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
//    内存消耗：38.1 MB, 在所有 Java 提交中击败了42.12%的用户
    int max_depth;
    int result;

    public int findBottomLeftValue(TreeNode root) {
        max_depth = 1;
        result = root.val;
        dfs(root, 1);
        return result;
    }

    public void dfs(TreeNode root, int depth) {
        if (depth > max_depth) {
            max_depth = depth;
            result = root.val;
        }
        if (root.left == null) {
            if (root.right != null) {
                dfs(root.right, depth+1);
            }
        }
        else {
            dfs(root.left, depth+1);
            if (root.right != null) {
                dfs(root.right, depth+1);
            }
        }
    }
}
