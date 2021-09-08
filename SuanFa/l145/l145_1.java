package SuanFa.l145;

import SuanFa.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class l145_1 {

    // 使用栈
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if (root == null) {
            return l;
        }
        Stack<TreeNode> s = new Stack<>();
        TreeNode prev = null;
        while (root != null || !s.empty()) {
            while (root.left != null) {
                s.push(root);
                root = root.left;
            }
            if (root.right == null || root.right == prev) {
                l.add(root.val);
                prev = root;
                root = null;
            }
            else {
                s.push(root);
                root = root.right;
            }

        }
        return l;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if (root == null) {
            return l;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        TreeNode prev = root;
        while (!s.empty()) {
            root = s.peek();
            if ((root.left == null && root.right == null) || root.left == prev || root.right == prev) {
                l.add(root.val);
                s.pop();
            }
            else {
                if (root.right != null && root.right != prev) {
                    s.push(root.right);
                }
                if (root.left != null && root.left != prev) {
                    s.push(root.left);
                }
            }

            prev = root;
        }
        return l;
    }
}
