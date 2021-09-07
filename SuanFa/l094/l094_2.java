package SuanFa.l094;

import SuanFa.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class l094_2 {

    // 官方题解的栈的解法，需要背
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        List<Integer> l = new ArrayList<>();
        while (root != null || !s.empty()) {
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            l.add(root.val);
            root = root.right;
        }
        return l;
    }
}