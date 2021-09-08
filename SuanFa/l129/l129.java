package SuanFa.l129;

import SuanFa.TreeNode;

public class l129 {

    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    public int sum(TreeNode root, int pre_sum) {
        if (root == null) {
            return 0;
        }
        int sum = pre_sum*10+root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        else {
            return sum(root.left, sum) + sum(root.right, sum);
        }
    }

}
