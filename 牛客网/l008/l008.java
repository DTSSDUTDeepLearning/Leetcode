package NowCoder.l008;

import java.util.ArrayList;
import java.util.List;

public class l008 {

    private ArrayList<ArrayList<Integer>> results;
    private ArrayList<Integer> l;

    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        l = new ArrayList<>();
        paths(root, sum);
        return results;
    }

    public void paths(TreeNode root, int sum) {
        if (root.left == null) {
            if (root.right == null) {
                if (root.val == sum) {
                    int index = l.size();
                    l.add(root.val);
                    results.add(new ArrayList<>(l));
                    l.remove(index);
                }
            }
            else {
                int index = l.size();
                l.add(root.val);
                paths(root.right, sum-root.val);
                l.remove(index);
            }
        }
        else {
            if (root.right == null) {
                int index = l.size();
                l.add(root.val);
                paths(root.left, sum-root.val);
                l.remove(index);
            }
            else {
                int index = l.size();
                l.add(root.val);
                paths(root.left, sum-root.val);
                paths(root.right, sum-root.val);
                l.remove(index);
            }
        }
    }
}
