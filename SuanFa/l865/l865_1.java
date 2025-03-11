package l865;

import java.util.HashMap;
import java.util.Map;

// 两次深度优先遍历，第一遍将所有的节点与其深度相关联，第二遍找到最深的节点的最近祖先节点
public class l865_1 {

    Map<TreeNode, Integer> depth;
    int max_depth;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        depth = new HashMap<>();
        depth.put(null, -1);
        max_depth = -1;
        dfs(root, null);
        return answer(root);
    }

    public void dfs(TreeNode node, TreeNode parent) {
        if (node == null) {
            return;
        }
        depth.put(node, depth.get(parent)+1);
        max_depth = Math.max(max_depth, depth.get(parent)+1);
        dfs(node.left, node);
        dfs(node.right, node);
    }

    public TreeNode answer(TreeNode node) {
        if (node == null || depth.get(node) == max_depth) {
            return node;
        }
        TreeNode L = answer(node.left);
        TreeNode R = answer(node.right);
        if (L != null) {
            if (R != null) {
                return node;
            }
            else {
                return L;
            }
        }
        else {
            return R;
        }
    }
}
