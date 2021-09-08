package SuanFa.l101;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class l101_2 {

    // 迭代，参考官方题解
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> s1 = new LinkedList<TreeNode>();
        Queue<TreeNode> s2 = new LinkedList<TreeNode>();
        TreeNode p = root.left;
        TreeNode q = root.right;
        s1.offer(p);
        s2.offer(q);

        while (true) {
            if (s1.peek() == null && s2.peek() == null) {
                return true;
            }
            if (s1.peek() == null ^ s2.peek() == null) {
                return false;
            }

            p = s1.poll();
            q = s2.poll();
            if (p.val == q.val) {
                if (p.left != null && q.right != null) {
                    s1.offer(p.left);
                    s2.offer(q.right);
                }
                else if (p.left != null || q.right != null){
                    return false;
                }
                if (p.right != null && q.left != null) {
                    s1.offer(p.right);
                    s2.offer(q.left);
                }
                else if (p.right != null || q.left != null){
                    return false;
                }
            }
            else {
                return false;
            }
        }
    }

    public static void main(String[] args) {

    }
}
