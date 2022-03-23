package NowCoder.l102;

public class l102 {

    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        return searchCommonAncestor(root, o1, o2).val;
    }

    public TreeNode searchCommonAncestor(TreeNode root, int o1, int o2) {
        if (root == null || root.val == o1 || root.val == o2) {
            return root;
        }
        TreeNode left = searchCommonAncestor(root.left, o1, o2);
        TreeNode right = searchCommonAncestor(root.right, o1, o2);
        if (left == null) {
            return right;
        }
        else if (right == null) {
            return left;
        }
        else {
            return root;
        }
    }
}
