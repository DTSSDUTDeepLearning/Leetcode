package NowCoder.l161;

import java.util.LinkedList;
import java.util.List;

public class l161 {

    List<Integer> l;

    public int[] inorderTraversal (TreeNode root) {
        l = new LinkedList<>();
        in(root);
        int len = l.size();
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            result[i] = l.get(i);
        }
        return result;
    }

    public void in (TreeNode root) {
        if (root == null) {
            return;
        }
        in(root.left);
        l.add(root.val);
        in(root.right);
    }
}
