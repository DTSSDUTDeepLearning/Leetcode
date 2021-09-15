package SuanFa.l450;

import SuanFa.TreeNode;

public class l450 {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (root.val == key) {
            if (root.left == null && root.right == null) {
                return null;
            }
            else if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            else {
                TreeNode curr = root.right;
                while (curr.left != null) {
                    curr = curr.left;
                }
                curr.left = root.left;
                return root.right;
            }
        }
        TreeNode prev = new TreeNode();
        TreeNode curr = root;
        boolean flag = true;
        while (curr != null && curr.val != key) {
            prev = curr;
            if (curr.val > key) {
                curr = curr.left;
                flag = true;
            }
            else {
                curr = curr.right;
                flag = false;
            }
        }
        if (curr == null) {
            return root;
        }
        if (curr.left == null && curr.right == null) {
            if (flag) {
                prev.left = null;
            }
            else {
                prev.right = null;
            }
        }
        else if (curr.left == null) {
            if (flag) {
                prev.left = curr.right;
            }
            else {
                prev.right = curr.right;
            }
        }
        else if (curr.right == null) {
            if (flag) {
                prev.left = curr.left;
            }
            else {
                prev.right = curr.left;
            }
        }
        else {
            TreeNode curr_root = curr.right;
            while (curr_root.left != null) {
                curr_root = curr_root.left;
            }
            curr_root.left = curr.left;
            if (flag) {
                prev.left = curr.right;
            }
            else {
                prev.right = curr.right;
            }
        }
        return root;
    }
}
