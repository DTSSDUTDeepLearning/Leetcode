package SuanFa.l872;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class l872 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new LinkedList<>();
        leaf(root1, l1);
        leaf(root2, l2);
        return l1.equals(l2);
    }

    public void leaf(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            l.add(root.val);
            return;
        }
        leaf(root.left, l);
        leaf(root.right, l);
    }
}
