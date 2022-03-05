package SuanFa.l993;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class l993 {

    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            int xparent = 0;
            int yparent = 0;
            for (int i = 0;i < len;i++) {
                root = q.poll();
                if (root.left != null) {
                    q.offer(root.left);
                    if (root.left.val == x) {
                        xparent = root.val;
                    }
                    if (root.left.val == y) {
                        yparent = root.val;
                    }
                }
                if (root.right != null) {
                    q.offer(root.right);
                    if (root.right.val == x) {
                        xparent = root.val;
                    }
                    if (root.right.val == y) {
                        yparent = root.val;
                    }
                }
            }
            if (xparent != 0 && yparent != 0 && xparent != yparent) {
                return true;
            }
            if (xparent != 0 ^ yparent != 0) {
                return false;
            }
        }
        return false;
    }
}
