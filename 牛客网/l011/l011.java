package NowCoder.l011;

public class l011 {

    public TreeNode sortedArrayToBST (int[] num) {
        if (num.length == 0) {
            return null;
        }
        return BST(num, 0, num.length-1);
    }

    public TreeNode BST(int[] num, int left, int right) {
        if (left == right) {
            return new TreeNode(num[left]);
        }
        else if (left == right-1) {
            TreeNode root = new TreeNode(num[right]);
            root.left = new TreeNode(num[left]);
            return root;
        }
        else {
            int mid = left+(right-left+1)/2;
            TreeNode root = new TreeNode(num[mid]);
            root.left = BST(num, left, mid-1);
            root.right = BST(num, mid+1, right);
            return root;
        }
    }
}
