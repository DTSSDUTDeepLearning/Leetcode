package SuanFa.l107;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
            result.add(0, l);
        }
        return result;
    }
}
