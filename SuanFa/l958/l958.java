package SuanFa.l958;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class l958 {

    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = true;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0;i < len;i++) {
                root = q.poll();
                if (root.left != null) {
                    if (flag) {
                        q.offer(root.left);
                    }
                    else {
                        return false;
                    }
                }
                else {
                    if (flag) {
                        flag = false;
                    }
                }
                if (root.right != null) {
                    if (flag) {
                        q.offer(root.right);
                    }
                    else {
                        return false;
                    }
                }
                else {
                    if (flag) {
                        flag = false;
                    }
                }
            }
        }
        return true;
    }
}
