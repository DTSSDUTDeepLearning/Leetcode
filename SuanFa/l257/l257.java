package SuanFa.l257;

import SuanFa.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class l257 {

    List<List<Integer>> result;
    List<Integer> l;

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> r = new LinkedList<>();
        if (root == null) {
            return r;
        }
        result = new LinkedList<>();
        l = new LinkedList<>();
        dfs(root);
        for (List<Integer> list : result) {
            int len = list.size();
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(0));
            for (int i = 1;i < len;i++) {
                sb.append("->"+list.get(i));
            }
            r.add(sb.toString());
        }
        return r;
    }

    public void dfs(TreeNode root) {
        l.add(root.val);
        if (root.left == null) {
            if (root.right == null) {
                result.add(new ArrayList<>(l));
            }
            else {
                dfs(root.right);
            }
        }
        else {
            dfs(root.left);
            if (root.right != null) {
                dfs(root.right);
            }
        }
        l.remove(l.size()-1);
    }
}
