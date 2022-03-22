package NowCoder.l058;

import java.util.LinkedList;
import java.util.List;

public class l058 {

    List<Integer> l;

    public int[] findError (TreeNode root) {
        l = new LinkedList<>();
        in(root);
        int[] result = new int[2];
        int len = l.size();
        for (int i = 0;i < len-1;i++) {
            if (l.get(i) > l.get(i+1)) {
                result[1] = l.get(i);
                break;
            }
        }
        for (int i = len-1;i > 0;i--) {
            if (l.get(i) < l.get(i-1)) {
                result[0] = l.get(i);
                break;
            }
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
