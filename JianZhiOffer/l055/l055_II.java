package JianZhiOffer.l055;

public class l055_II {

    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        if (leftheight == -1 || rightheight == -1 || Math.abs(leftheight-rightheight) > 1) {
            return -1;
        }
        else {
            return Math.max(leftheight, rightheight)+1;
        }
    }
}
