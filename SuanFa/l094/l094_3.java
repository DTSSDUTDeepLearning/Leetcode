package SuanFa.l094;

import SuanFa.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class l094_3 {

    // 使用递归
    public static void inorder(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        inorder(root.left, l);
        l.add(root.val);
        inorder(root.right, l);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        inorder(root, l);
        return l;
    }
}