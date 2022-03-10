package SuanFa.l1302;

import SuanFa.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class l1302_1 {

    //广度优先遍历
//    执行用时：6 ms, 在所有 Java 提交中击败了23.39%的用户
//    内存消耗：39.7 MB, 在所有 Java 提交中击败了52.07%的用户
    public int deepestLeavesSum(TreeNode root) {
        Deque<TreeNode> q = new LinkedList<>();
        int result = 0;
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            result = 0;
            for (int i = 0;i < len;i++) {
                TreeNode node = q.pop();
                result += node.val;
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
        }
        return result;
    }
}
