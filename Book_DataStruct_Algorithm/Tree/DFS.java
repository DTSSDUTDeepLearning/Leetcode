package Book_DataStruct_Algorithm.Tree;

import java.util.*;

public class DFS {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        node4.right = node7;
        node6.left = node8;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;
        node1.left = node2;
        node1.right = node3;
        System.out.print("使用递归法进行前序遍历，得到的结果是：");
        System.out.println(Arrays.toString(preOrderRecursion(node1)));
        System.out.print("使用栈进行前序遍历，得到的结果是：");
        System.out.println(Arrays.toString(preOrderStack(node1)));
        System.out.print("使用递归法进行中序遍历，得到的结果是：");
        System.out.println(Arrays.toString(inOrderRecursion(node1)));
        System.out.print("使用栈进行中序遍历，得到的结果是：");
        System.out.println(Arrays.toString(inOrderStack(node1)));
        System.out.print("使用递归法进行后序遍历，得到的结果是：");
        System.out.println(Arrays.toString(postOrderRecursion(node1)));
        System.out.print("使用栈进行后序遍历，得到的结果是：");
        System.out.println(Arrays.toString(postOrderStack(node1)));
    }

    public static int[] preOrderRecursion(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        preOrderRecursion_do(root, l);
        int[] resutls = new int[l.size()];
        for (int i = 0;i < l.size();i++) {
            resutls[i] = l.get(i);
        }
        return resutls;
    }

    public static void preOrderRecursion_do(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        l.add(root.val);
        preOrderRecursion_do(root.left, l);
        preOrderRecursion_do(root.right, l);
    }

    public static int[] inOrderRecursion(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        inOrderRecursion_do(root, l);
        int[] resutls = new int[l.size()];
        for (int i = 0;i < l.size();i++) {
            resutls[i] = l.get(i);
        }
        return resutls;
    }

    public static void inOrderRecursion_do(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        inOrderRecursion_do(root.left, l);
        l.add(root.val);
        inOrderRecursion_do(root.right, l);
    }

    public static int[] postOrderRecursion(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        postOrderRecursion_do(root, l);
        int[] resutls = new int[l.size()];
        for (int i = 0;i < l.size();i++) {
            resutls[i] = l.get(i);
        }
        return resutls;
    }

    public static void postOrderRecursion_do(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        postOrderRecursion_do(root.left, l);
        postOrderRecursion_do(root.right, l);
        l.add(root.val);
    }

    public static int[] preOrderStack(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        Deque<TreeNode> s = new ArrayDeque<>();
        s.push(root);
        while (!s.isEmpty()) {
            root = s.pop();
            l.add(root.val);
            if (root.right != null) {
                s.push(root.right);
            }
            if (root.left != null) {
                s.push(root.left);
            }
        }
        int len = l.size();
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            result[i] = l.get(i);
        }
        return result;
    }

    public static int[] inOrderStack(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        Deque<TreeNode> s = new ArrayDeque<>();
        while (!s.isEmpty() || root != null) {
            if (root != null) {
                s.push(root);
                root = root.left;
            }
            else {
                root = s.pop();
                l.add(root.val);
                root = root.right;
            }
        }
        int len = l.size();
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            result[i] = l.get(i);
        }
        return result;
    }

    public static int[] postOrderStack(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        Deque<TreeNode> s = new ArrayDeque<>();
        s.push(root);
        TreeNode prev = root;
        while (!s.isEmpty()) {
            root = s.peek();
            if ((root.left == null && root.right == null) || root.left == prev || root.right == prev) {
                l.add(root.val);
                s.pop();
            }
            else {
                if (root.right != null) {
                    s.push(root.right);
                }
                if (root.left != null && root.left != prev) {
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
