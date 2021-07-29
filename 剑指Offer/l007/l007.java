package JianZhiOffer.l007;

public class l007 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return bulid(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
    }

    public static TreeNode bulid(int[] preorder, int[] inorder, int pre_left, int pre_right, int in_left, int in_right) {
        if (pre_left == pre_right+1) {
            return null;
        }
        int root_val = preorder[pre_left];
        TreeNode root = new TreeNode(root_val);
        int i = in_left;
        while (i <= in_right && inorder[i] != root_val) {
            i++;
        }
        int x = pre_left+i-in_left;
        root.left = bulid(preorder, inorder, pre_left+1, x, in_left, i-1);
        root.right = bulid(preorder, inorder, x+1, pre_right, i+1, in_right);
        return root;
    }
}
