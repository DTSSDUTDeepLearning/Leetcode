package SuanFa.l102;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> results = new LinkedList<>();
        if (root == null) {
            return results;
        }
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            List<Integer> result = new LinkedList<>();
            for (int i = 0;i < len;i++) {
                TreeNode node = q.poll();
                result.add(node.val);
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            results.add(result);
        }
        return results;
    }
}
