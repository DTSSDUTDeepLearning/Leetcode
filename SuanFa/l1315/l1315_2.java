package SuanFa.l1315;

import SuanFa.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class l1315_2 {

    // 深度优先遍历
//    执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
//    内存消耗：40.6 MB, 在所有 Java 提交中击败了17.46%的用户
    int sum;

    public int sumEvenGrandparent(TreeNode root) {
        sum = 0;
        dfs(root, 1, 1);
        return sum;
    }

    public void dfs(TreeNode root, int gp_val, int p_val) {
        if (root == null) {
            return;
        }
        if (gp_val % 2 == 0) {
            sum+=root.val;
        }
        dfs(root.left, p_val, root.val);
        dfs(root.right, p_val, root.val);
    }
}
