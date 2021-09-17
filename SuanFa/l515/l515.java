package SuanFa.l515;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l515 {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0;i < len;i++) {
                root = q.poll();
                max = Math.max(max, root.val);
                if (root.left != null) {
                    q.offer(root.left);
                }
                if (root.right != null) {
                    q.offer(root.right);
                }
            }
            result.add(max);
        }
        return result;
    }
}
