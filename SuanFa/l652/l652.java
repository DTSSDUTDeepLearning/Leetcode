package SuanFa.l652;

import SuanFa.TreeNode;

import java.util.*;

public class l652 {

    int uuid;
    Map<String, Integer> tree2uuid;
    Map<Integer, Integer> uuid2count;
    List<TreeNode> result;

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        uuid = 1;
        tree2uuid = new HashMap<>();
        uuid2count = new HashMap<>();
        result = new LinkedList<>();
        dfs(root);
        return result;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        String serial = root.val + "," + dfs(root.left) + "," + dfs(root.right);
        int tree_id;
        if (tree2uuid.containsKey(serial)) {
            tree_id = tree2uuid.get(serial);
        }
        else {
            tree_id = uuid++;
            tree2uuid.put(serial, tree_id);
        }
        uuid2count.put(tree_id, uuid2count.getOrDefault(tree_id, 0) + 1);
        if (uuid2count.get(tree_id) == 2) {
            result.add(root);
        }
        return tree_id;
    }
}
