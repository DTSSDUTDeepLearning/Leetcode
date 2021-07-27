package JianZhiOffer.l032;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l032_II {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            List<Integer> l = new LinkedList<>();
            for (int i = 0;i < len;i++) {
                root = q.poll();
                l.add(root.val);
                if (root.left != null) {
                    q.offer(root.left);
                }
                if (root.right != null) {
                    q.offer(root.right);
                }
            }
            result.add(l);
        }
        return result;
    }
}
