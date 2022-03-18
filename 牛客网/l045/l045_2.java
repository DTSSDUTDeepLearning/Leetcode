package NowCoder.l045;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class l045_2 {

    // 栈
    public int[][] threeOrders (TreeNode root) {
        int[] pre = pre_stack(root);
        int len = pre.length;
        int[][] results = new int[3][len];
        results[0] = pre;
        results[1] = in_stack(root);
        results[2] = order_stack(root);
        return results;
    }

    public static int[] pre_stack(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        Deque<TreeNode> s = new ArrayDeque<>();
        s.push(root);
        while (!s.isEmpty()) {
            TreeNode node = s.poll();
            l.add(node.val);
            if (node.right != null) {
                s.push(node.right);
            }
            if (node.left != null) {
                s.push(node.left);
            }
        }
        int len = l.size();
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            result[i] = l.get(i);
        }
        return result;
    }

    public static int[] in_stack(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        Deque<TreeNode> s = new ArrayDeque<>();
        while (root != null || !s.isEmpty()) {
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            l.add(root.val);
            root = root.right;
        }
        int len = l.size();
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            result[i] = l.get(i);
        }
        return result;
    }

    public static int[] order_stack(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        Deque<TreeNode> s = new ArrayDeque<>();
        s.push(root);
        TreeNode prev = root;
        while (!s.isEmpty()) {
            root = s.peek();
            if (root.left == null && root.right == null || root.left == prev || root.right == prev) {
                l.add(root.val);
                s.pop();
            }
            else {
                if (root.right != null) {
                    s.push(root.right);
                }
                if (root.left != null) {
                    s.push(root.left);
                }
            }
            prev = root;
        }
        int len = l.size();
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            result[i] = l.get(i);
        }
        return result;
    }


}
