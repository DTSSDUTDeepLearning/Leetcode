package JianZhiOffer.l027;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class l027 {

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        root.left = mirrorTree(root.left);
        root.right = mirrorTree(root.right);
        return root;
    }
}
