package l1123; // 与l865相同

import java.util.HashMap;
import java.util.Map;

// 一次深度优先遍历，将所有的节点与其相距根节点的距离相关联
public class l1123_2 {

    Map<TreeNode, Integer> dist;

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        dist = new HashMap<>();
        return dfs(root);
    }

    public TreeNode dfs(TreeNode node) {
        if (node == null) {
            dist.put(null, 0);
            return null;
        }
        TreeNode L = dfs(node.left);
        TreeNode R = dfs(node.right);
        if (dist.get(L) < dist.get(R)) {
            dist.put(R, dist.get(R)+1);
            return R;
        }
        else if (dist.get(L) > dist.get(R)) {
            dist.put(L, dist.get(L)+1);
            return L;
        }
        else {
            dist.put(node, dist.get(L)+1);
            return node;
        }
    }
}
