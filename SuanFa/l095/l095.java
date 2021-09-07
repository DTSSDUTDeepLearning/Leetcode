package SuanFa.l095;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class l095 {

    public List<TreeNode> generateTrees(int n) {
        return dfs(1, n);
    }

    public List<TreeNode> dfs(int begin, int end) {
        List<TreeNode> result = new LinkedList<>();
        if (begin > end) {
            result.add(null);
            return result;
        }
        for (int i = begin;i <= end;i++) {
            List<TreeNode> left = dfs(begin, i-1);
            List<TreeNode> right = dfs(i+1, end);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode curr = new TreeNode(i);
                    curr.left = l;
                    curr.right = r;
                    result.add(curr);
                }
            }
        }
        return result;
    }
}
