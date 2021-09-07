package SuanFa.l100;

import SuanFa.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class l100 {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        TreeNode curr1 = p;
        TreeNode curr2 = q;
        Queue<TreeNode> s1 = new LinkedList<TreeNode>();
        Queue<TreeNode> s2 = new LinkedList<TreeNode>();
        s1.offer(curr1);
        s2.offer(curr2);
        while (true) {
            if (s1.peek() == null && s2.peek() == null) {
                return true;
            }
            if (s1.peek() == null ^ s2.peek() == null) {
                return false;
            }

            curr1 = s1.poll();
            curr2 = s2.poll();
            if (curr1.val == curr2.val) {
                if (curr1.left != null && curr2.left != null) {
                    s1.offer(curr1.left);
                    s2.offer(curr2.left);
                }
                else if (curr1.left != null || curr2.left != null){
                    return false;
                }
                if (curr1.right != null && curr2.right != null) {
                    s1.offer(curr1.right);
                    s2.offer(curr2.right);
                }
                else if (curr1.right != null || curr2.right != null){
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
