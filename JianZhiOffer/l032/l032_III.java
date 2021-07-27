package JianZhiOffer.l032;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l032_III {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = true;
        while (!q.isEmpty()) {
            int len = q.size();
            Deque<Integer> l = new LinkedList<>();
            for (int i = 0;i < len;i++) {
                root = q.poll();
                if (flag) {
                    l.offerLast(root.val);
                }
                else {
                    l.offerFirst(root.val);
                }
                if (root.left != null) {
                    q.offer(root.left);
                }
                if (root.right != null) {
                    q.offer(root.right);
                }
            }
            flag = !flag;
            result.add(new LinkedList<>(l));
        }
        return result;
    }
}
