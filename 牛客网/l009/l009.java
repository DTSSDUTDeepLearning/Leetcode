package NowCoder.l009;

public class l009 {

    public boolean hasPathSum (TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return check(root, sum);
    }

    public boolean check(TreeNode root, int sum) {
        if (root.left == null) {
            if (root.right == null) {
                return root.val == sum;
            }
            else {
                return check(root.right, sum-root.val);
            }
        }
        else {
            if (root.right == null) {
                return check(root.left, sum-root.val);
            }
            else {
                return check(root.left, sum-root.val) || check(root.right, sum-root.val);
            }
        }
    }
}
