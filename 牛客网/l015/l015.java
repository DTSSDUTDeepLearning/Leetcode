package NowCoder.l015;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class l015 {

    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            ArrayList<Integer> result = new ArrayList<>();
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
