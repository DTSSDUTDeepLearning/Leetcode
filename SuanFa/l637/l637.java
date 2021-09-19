package SuanFa.l637;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l637 {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            double sum = 0;
            for (int i = 0;i < len;i++) {
                root = q.poll();
                sum+=root.val;
                if (root.left != null) {
                    q.offer(root.left);
                }
                if (root.right != null) {
                    q.offer(root.right);
                }
            }
            result.add(sum / len);
        }
        return result;
    }
}
