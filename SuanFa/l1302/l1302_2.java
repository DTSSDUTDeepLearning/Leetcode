package SuanFa.l1302;

import SuanFa.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class l1302_2 {

    //深度优先遍历
//    执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
//    内存消耗：40.3 MB, 在所有 Java 提交中击败了32.66%的用户
    int sum;
    int maxdeep;

    public int deepestLeavesSum(TreeNode root) {
        sum = 0;
        maxdeep = 1;
        deep(root, 1);
        return sum;
    }

    public void deep(TreeNode root, int deep) {
        if (deep == maxdeep) {
            sum += root.val;
        }
        else if (deep > maxdeep) {
            sum = root.val;
            maxdeep = deep;
        }
        if (root.left != null) {
            deep(root.left, deep+1);
        }
        if (root.right != null) {
            deep(root.right, deep+1);
        }
    }
}
