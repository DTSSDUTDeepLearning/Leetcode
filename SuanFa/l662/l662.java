package SuanFa.l662;

import SuanFa.TreeNode;

import java.util.*;

public class l662 {

    Map<Integer, Integer> m;
    int result;

    public int widthOfBinaryTree(TreeNode root) {
        result = 1;
        m = new HashMap<>();
        dfs(root, 0, 0);
        return result;
    }

    public void dfs(TreeNode root, int depth, int pos) {
        if (root == null) {
            return;
        }
        if (m.containsKey(depth)) {
            result = Math.max(result, pos-m.get(depth)+1);
        }
        else {
            m.put(depth, pos);
        }
        dfs(root.left, depth+1, pos*2);
        dfs(root.right, depth+1, pos*2+1);
    }
}
