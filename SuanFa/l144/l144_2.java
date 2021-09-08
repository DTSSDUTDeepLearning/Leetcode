package SuanFa.l144;

import SuanFa.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class l144_2 {

    // 使用递归求解二叉树的前序遍历
    public static void preorder(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        l.add(root.val);
        preorder(root.left, l);
        preorder(root.right, l);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        preorder(root, l);
        return l;
    }

}
