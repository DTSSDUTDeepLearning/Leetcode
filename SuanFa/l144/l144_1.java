package SuanFa.l144;

import SuanFa.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class l144_1 {

    // 使用栈求解二叉树的前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if (root == null) {
            return l;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while (!s.empty()) {
            root = s.pop();
            l.add(root.val);
            if (root.right != null) {
                s.push(root.right);
            }
            if (root.left != null) {
                s.push(root.left);
            }
        }
        return l;
    }

}
