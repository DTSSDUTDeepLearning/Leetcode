package SuanFa.l094;

import SuanFa.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class l094_1 {

    // 自己的解法，使用栈
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if (root == null) {
            return l;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while (!s.empty()) {
            TreeNode curr = s.peek();
            while (curr.left != null) {
                s.push(curr.left);
                curr = curr.left;
            }
            l.add(curr.val);
            s.pop();
            while (curr.right == null && !s.empty()) {
                curr = s.pop();
                l.add(curr.val);
            }
            if (curr.right != null) {
                s.push(curr.right);
            }
        }
        return l;
    }
}