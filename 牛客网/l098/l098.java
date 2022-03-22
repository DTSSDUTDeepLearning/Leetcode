package NowCoder.l098;

import java.util.LinkedList;
import java.util.List;

public class l098 {

    public boolean isContains (TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return search(root1, root2);
    }

    public boolean search(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return false;
        }
        return search(root1.left, root2) || search(root1.right, root2) || check(root1, root2);
    }

    public boolean check(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val){
            return false;
        }
        return check(root1.left, root2.left) && check(root1.right, root2.right);
    }
}
