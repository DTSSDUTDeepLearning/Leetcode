package NowCoder.l064;

public class l064 {

    TreeNode pre;
    TreeNode head;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return pRootOfTree;
        }
        pre = null;
        in(pRootOfTree);
        head.left = pre;
        pre.right = head;
        return head;
    }

    public void in(TreeNode root) {
        if (root == null) {
            return;
        }
        in(root.left);
        if (pre != null) {
            pre.right = root;
        }
        else {
            head = root;
        }
        root.left = pre;
        pre = root;
        in(root.right);
    }
}
