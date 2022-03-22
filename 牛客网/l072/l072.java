package NowCoder.l072;

public class l072 {

    public TreeNode Mirror (TreeNode pRoot) {
        if (pRoot == null) {
            return null;
        }
        TreeNode result = new TreeNode(pRoot.val);
        result.left = Mirror(pRoot.right);
        result.right = Mirror(pRoot.left);
        return result;
    }
}
