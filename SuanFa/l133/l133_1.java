package SuanFa.l133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class l133_1 {

    // 深度优先遍历
//    执行用时：29 ms, 在所有 Java 提交中击败了65.40%的用户
//    内存消耗：38.5 MB, 在所有 Java 提交中击败了63.75%的用户
    public Map<Node, Node> m;

    public Node cloneGraph(Node node) {
        m = new HashMap<>();
        return dfs(node);
    }

    public Node dfs(Node node) {
        if (node == null) {
            return null;
        }
        if (m.containsKey(node)) {
            return m.get(node);
        }
        Node cloneNode = new Node(node.val, new ArrayList<>());
        m.put(node, cloneNode);
        for (Node n : node.neighbors) {
            cloneNode.neighbors.add(dfs(n));
        }
        return cloneNode;
    }

}
