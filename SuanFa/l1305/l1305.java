package SuanFa.l1305;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class l1305 {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new LinkedList<>();
        in(root1, l1);
        in(root2, l2);
        int len1 = l1.size();
        int len2 = l2.size();
        if (len1 == 0) {
            return l2;
        }
        if (len2 == 0) {
            return l1;
        }
        int i1 = 0;
        int i2 = 0;
        List<Integer> l3 = new LinkedList<>();
        while (i1 < len1 && i2 < len2) {
            if (l1.get(i1) < l2.get(i2)) {
                l3.add(l1.get(i1++));
            }
            else {
                l3.add(l2.get(i2++));
            }
        }
        if (i1 == len1) {
            for (int i = i2;i < len2;i++) {
                l3.add(l2.get(i));
            }
        }
        else {
            for (int i = i1;i < len1;i++) {
                l3.add(l1.get(i));
            }
        }
        return l3;
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
