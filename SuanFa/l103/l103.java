package SuanFa.l103;

import SuanFa.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l103 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> results = new LinkedList<>();
        if (root == null) {
            return results;
        }
        q.offer(root);
        boolean flag = true;
        while (!q.isEmpty()) {
            int len = q.size();
            Deque<Integer> result = new LinkedList<>();
            for (int i = 0;i < len;i++) {
                TreeNode node = q.poll();
                if (flag) {
                    result.offerLast(node.val);
                }
                else {
                    result.offerFirst(node.val);
                }
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            flag = !flag;
            results.add(new LinkedList<>(result));
        }
        return results;
    }
}
