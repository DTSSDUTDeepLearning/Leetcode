package SuanFa.l113;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class l113 {

    private List<List<Integer>> results;
    private List<Integer> l;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        results = new LinkedList<>();
        if (root == null) {
            return results;
        }
        l = new LinkedList<>();
        path(root, targetSum);
        return results;
    }

    public void path(TreeNode root, int sum) {
        if (root.left == null) {
            if (root.right == null) {
                if (root.val == sum) {
                    int id = l.size();
                    l.add(sum);
                    results.add(new LinkedList<>(l));
                    l.remove(id);
                }
            }
            else {
                int id = l.size();
                l.add(root.val);
                path(root.right, sum-root.val);
                l.remove(id);
            }
        }
        else {
            if (root.right == null) {
                int id = l.size();
                l.add(root.val);
                path(root.left, sum-root.val);
                l.remove(id);
            }
            else {
                int id = l.size();
                l.add(root.val);
                path(root.left, sum-root.val);
                l.remove(id);
                l.add(root.val);
                path(root.right, sum-root.val);
                l.remove(id);
            }
        }
    }
}
