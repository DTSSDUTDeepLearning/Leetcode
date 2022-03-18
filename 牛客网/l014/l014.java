package NowCoder.l014;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class l014 {

    public ArrayList<ArrayList<Integer>> Print (TreeNode pRoot) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        if (pRoot == null) {
            return results;
        }
        q.offer(pRoot);
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
            results.add(new ArrayList<>(result));
        }
        return results;
    }
}
