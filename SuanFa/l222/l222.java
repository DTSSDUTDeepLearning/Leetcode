package SuanFa.l222;

import SuanFa.TreeNode;

public class l222 {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int h = 0;
        TreeNode curr = root;
        while (curr.left != null) {
            h++;
            curr = curr.left;
        }
        int left = 1<<h;
        int right = (1<<(h+1))-1;
        while (left < right) {
            int mid = left+(right-left)/2;
            if (exists(root, h, mid)) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public boolean exists(TreeNode root, int level, int k) {
        int bits = 1 << (level-1);
        TreeNode node = root;
        while (node != null && bits > 0) {
            if ((bits & k) == 0) {
                node = node.left;
            } else {
                node = node.right;
            }
            bits>>=1;
        }
        return node != null;
    }
}
