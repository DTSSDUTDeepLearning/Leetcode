package SuanFa.l098;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class l098_2 {

    List<Integer> l;

    // 利用BST的中序遍历是递增的性质
    public boolean isValidBST(TreeNode root) {
        l = new LinkedList<>();
        in(root);
        int len = l.size();
        if (len <= 1) {
            return true;
        }
        for (int i = 1;i < len;i++) {
            if (l.get(i) < l.get(i-1)) {
                return false;
            }
        }
        return true;
    }

    public void in(TreeNode root) {
        if (root == null) {
            return;
        }
        in(root.left);
        l.add(root.val);
        in(root.right);
    }
}
