package SuanFa.l429;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l429 {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            List<Integer> l = new LinkedList<>();
            for (int i = 0;i < len;i++) {
                Node node = q.poll();
                l.add(node.val);
                for (Node n : node.children) {
                    q.offer(n);
                }
            }
            result.add(l);
        }
        return result;
    }
}
