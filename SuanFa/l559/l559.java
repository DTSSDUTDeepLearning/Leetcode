package SuanFa.l559;

public class l559 {

    public int maxDepth(Node root) {
        if (root == null || root.children == null) {
            return 0;
        }
        int max_depth = 0;
        for (Node c : root.children) {
            int depth = maxDepth(c);
            if (depth > max_depth) {
                max_depth = depth;
            }
        }
        return max_depth+1;
    }
}
