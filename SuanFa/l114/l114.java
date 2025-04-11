package l114;

public class l114 {

    List<TreeNode> preList;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        preList = new ArrayList<>();
        dfs(root);
        TreeNode preHead = new TreeNode(0);
        TreeNode curr = preHead;
        for (TreeNode tmp : preList) {
            curr.right = tmp;
            tmp.left = null;
            curr = tmp;
        }
        root.left = null;
        root.right = preHead.right.right;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        preList.add(new TreeNode(root.val));
        dfs(root.left);
        dfs(root.right);
    }
}
