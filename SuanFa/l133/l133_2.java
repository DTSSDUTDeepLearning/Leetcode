package SuanFa.l133;

import java.util.*;

public class l133_2 {

    // 广度优先遍历
//    执行用时：29 ms, 在所有 Java 提交中击败了64.75%的用户
//    内存消耗：38.5 MB, 在所有 Java 提交中击败了68.81%的用户
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Node, Node> m = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        m.put(node, new Node(node.val, new ArrayList<>()));
        while (!q.isEmpty()) {
            Node cur = q.poll();
            for (Node n : cur.neighbors) {
                if (!m.containsKey(n)) {
                    m.put(n, new Node(n.val, new ArrayList<>()));
                    q.offer(n);
                }
                m.get(cur).neighbors.add(m.get(n));
            }
        }
        return m.get(node);
    }

}
