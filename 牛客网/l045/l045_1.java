package NowCoder.l045;

import java.util.LinkedList;
import java.util.List;

public class l045_1 {

    // 递归
    public int[][] threeOrders (TreeNode root) {
        List<Integer> l = new LinkedList<>();
        pre_recursion(root, l);
        int len = l.size();
        int[][] results = new int[3][len];
        for (int i = 0;i < len;i++) {
            results[0][i] = l.get(i);
        }
        l = new LinkedList<>();
        in_recursion(root, l);
        for (int i = 0;i < len;i++) {
            results[1][i] = l.get(i);
        }
        l = new LinkedList<>();
        order_recursion(root, l);
        for (int i = 0;i < len;i++) {
            results[2][i] = l.get(i);
        }
        return results;
    }

    public static void pre_recursion(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        l.add(root.val);
        pre_recursion(root.left, l);
        pre_recursion(root.right, l);
    }

    public static void in_recursion(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        in_recursion(root.left, l);
        l.add(root.val);
        in_recursion(root.right, l);
    }

    public static void order_recursion(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        order_recursion(root.left, l);
        order_recursion(root.right, l);
        l.add(root.val);
    }
}
