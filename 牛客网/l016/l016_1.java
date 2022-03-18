package NowCoder.l016;

public class l016_1 {

    //递归
    public boolean isSymmetric (TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSym(root.left, root.right);
    }

    public static boolean isSym(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null ^ q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSym(p.left, q.right) && isSym(p.right, q.left);
    }
}
