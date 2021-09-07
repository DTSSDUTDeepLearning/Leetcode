package SuanFa.l099;

import SuanFa.TreeNode;

public class l099 {

    TreeNode pre;
    TreeNode wrong1;
    TreeNode wrong2;

    public void recoverTree(TreeNode root) {
        pre = wrong1 = wrong2 = null;
        in(root);
        int tmp = wrong1.val;
        wrong1.val = wrong2.val;
        wrong2.val = tmp;
    }

    public void in(TreeNode root) {
        if (root == null) {
            return;
        }
        in(root.left);
        if (pre != null) {
            if (pre.val > root.val) {
                wrong1 = root;
                if (wrong2 == null) {
                    wrong2 = pre;
                }
            }
        }
        pre = root;
        in(root.right);
    }
}
