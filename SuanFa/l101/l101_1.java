package SuanFa.l101;

import SuanFa.TreeNode;

public class l101_1 {

    // 递归，参考官方题解
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return check(root.left, root.right);
    }

    public static boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null ^ q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return (check(p.left, q.right) && check(p.right, q.left));
    }

    public static void main(String[] args) {

    }
}
