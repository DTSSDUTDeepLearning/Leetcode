package NowCoder.l081;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class l081 {

    TreeNode result;

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (k <= 0 || pRoot == null) {
            return null;
        }
        Deque<TreeNode> s = new LinkedList<>();
        s.push(pRoot);
        while (!s.isEmpty()) {
            pRoot = s.peek();
            while (pRoot.left != null) {
                s.push(pRoot.left);
                pRoot = pRoot.left;
            }
            if (k == 1) {
                return pRoot;
            }
            else {
                k--;
            }
            s.pop();
            while (pRoot.right == null && !s.isEmpty()) {
                pRoot = s.pop();
                if (k == 1) {
                    return pRoot;
                }
                else {
                    k--;
                }
            }
            if (pRoot.right != null) {
                s.push(pRoot.right);
            }
        }
        return null;
    }


}
