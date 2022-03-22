package NowCoder.l080;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class l080 {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        if (pRoot == null) {
            return results;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(pRoot);
        while (!q.isEmpty()) {
            ArrayList<Integer> l = new ArrayList<>();
            int len = q.size();
            for (int i = 0;i < len;i++) {
                TreeNode node = q.poll();
                l.add(node.val);
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            results.add(l);
        }
        return results;
    }
}
