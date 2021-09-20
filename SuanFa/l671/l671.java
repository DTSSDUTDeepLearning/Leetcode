package SuanFa.l671;

import SuanFa.TreeNode;

public class l671 {

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int[] min = new int[2];
        min[0] = min[1] = root.val;
        bianlimin(root, min);
        if (min[0] == min[1]) {
            return -1;
        }
        else {
            return min[1];
        }
    }

    public static void bianlimin(TreeNode root, int[] min) {
        if (root.left == null) {
            if (root.right == null) {
                return;
            }
            else {
                bianlimin(root.right, min);
            }
        }
        else {
            if (root.right == null) {
                bianlimin(root.left, min);
            }
            else {
                if (root.left.val == root.val) {
                    if (root.right.val == root.val) {
                        bianlimin(root.left, min);
                        bianlimin(root.right, min);
                    }
                    else {
                        if (min[0] == min[1] || root.right.val < min[1]) {
                            min[1] = root.right.val;
                        }
                        bianlimin(root.left, min);
                    }
                }
                else {
                    if (min[0] == min[1] || root.left.val < min[1]) {
                        min[1] = root.left.val;
                    }
                    bianlimin(root.right, min);
                }
            }
        }
    }
}
