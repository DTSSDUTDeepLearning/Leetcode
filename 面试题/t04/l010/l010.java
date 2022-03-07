package MianShiTi.t04.l010;

import MianShiTi.t04.TreeNode;

public class l010 {

    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) {
            return false;
        }
        return search(t1, t2);
    }

    public boolean search(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return false;
        }
        return search(root1.left, root2) || search(root1.right, root2) || check(root1, root2);
    }

    public boolean check(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null || root1.val != root2.val){
            return false;
        }
        return check(root1.left, root2.left) && check(root1.right, root2.right);
    }
}
