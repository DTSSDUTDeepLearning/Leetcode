package SuanFa.l1609;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class l1609 {

    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean level = true;
        while (!q.isEmpty()) {
            int len = q.size();
            if (level) {
                TreeNode pre = q.poll();
                if (pre.val % 2 == 0) {
                    return false;
                }
                if (pre.left != null) {
                    q.offer(pre.left);
                }
                if (pre.right != null) {
                    q.offer(pre.right);
                }
                for (int i = 1;i < len;i++) {
                    root = q.poll();
                    if (root.val % 2 == 0 || root.val <= pre.val) {
                        return false;
                    }
                    if (root.left != null) {
                        q.offer(root.left);
                    }
                    if (root.right != null) {
                        q.offer(root.right);
                    }
                    pre = root;
                }
            }
            else {
                TreeNode pre = q.poll();
                if (pre.val % 2 == 1) {
                    return false;
                }
                if (pre.left != null) {
                    q.offer(pre.left);
                }
                if (pre.right != null) {
                    q.offer(pre.right);
                }
                for (int i = 1;i < len;i++) {
                    root = q.poll();
                    if (root.val % 2 == 1 || root.val >= pre.val) {
                        return false;
                    }
                    if (root.left != null) {
                        q.offer(root.left);
                    }
                    if (root.right != null) {
                        q.offer(root.right);
                    }
                    pre = root;
                }
            }
            level = !level;
        }
        return true;
    }
}
