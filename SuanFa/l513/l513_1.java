package SuanFa.l513;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class l513_1 {

    // 广度优先遍历
//    执行用时：2 ms, 在所有 Java 提交中击败了41.55%的用户
//    内存消耗：38.2 MB, 在所有 Java 提交中击败了20.35%的用户
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int result = root.val;
        while (!q.isEmpty()) {
            int len = q.size();
            result = q.peek().val;
            for (int i = 0;i < len;i++) {
                root = q.poll();
                if (root.left != null) {
                    q.offer(root.left);
                }
                if (root.right != null) {
                    q.offer(root.right);
                }
            }
        }
        return result;
    }
}
