package SuanFa.l124;

import SuanFa.TreeNode;

public class l124 {

    int maxsum;

    public int maxPathSum(TreeNode root) {
        maxsum = Integer.MIN_VALUE;
        maxGain(root);
        return maxsum;
    }

    public int maxGain(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftGain = Math.max(maxGain(root.left), 0);
        int rightGain = Math.max(maxGain(root.right), 0);
        maxsum = Math.max(maxsum, root.val+leftGain+rightGain);
        return root.val+Math.max(leftGain, rightGain);
    }
}
