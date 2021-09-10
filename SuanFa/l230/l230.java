package SuanFa.l230;

import SuanFa.TreeNode;

public class l230 {

    int cnt;
    int result;
    int k;

    public int kthSmallest(TreeNode root, int k) {
        cnt = 0;
        this.k = k;
        in(root);
        return result;
    }

    public void in(TreeNode root) {
        if (root == null) {
            return;
        }
        in(root.left);
        cnt++;
        if (cnt == k) {
            result = root.val;
        }
        else {
            in(root.right);
        }
    }
}
