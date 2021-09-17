package SuanFa.l530;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class l530 {

    public int getMinimumDifference(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        in(root, l);
        int min = Integer.MAX_VALUE;
        int len = l.size();
        for (int i = 1;i < len;i++) {
            min = Math.min(min, l.get(i)-l.get(i-1));
        }
        return min;
    }

    public void in(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        in(root.left, l);
        l.add(root.val);
        in(root.right, l);
    }
}
