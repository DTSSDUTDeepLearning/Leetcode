package JianZhiOffer.l054;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class l054 {

    public int kthLargest(TreeNode root, int k) {
        Deque<TreeNode> s = new LinkedList<>();
        s.push(root);
        while (!s.isEmpty()) {
            root = s.peek();
            while (root.right != null) {
                s.push(root.right);
                root = root.right;
            }
            if (k == 1) {
                return root.val;
            }
            else {
                k--;
            }
            s.pop();
            while (root.left == null && !s.isEmpty()) {
                root = s.pop();
                if (k == 1) {
                    return root.val;
                }
                else {
                    k--;
                }
            }
            if (root.left != null) {
                s.push(root.left);
            }
        }
        return -1;
    }
}
