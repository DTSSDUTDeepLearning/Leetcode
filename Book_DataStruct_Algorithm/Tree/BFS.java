package Book_DataStruct_Algorithm.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

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
        System.out.print("使用广度优先遍历，得到的结果是：");
        System.out.println(Arrays.toString(BFS(node1)));
        System.out.print("使用带空结点的广度优先遍历，得到的结果是：");
        System.out.println(Arrays.toString(BFS_with_null(node1)));
    }

    public static int[] BFS(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            root = q.poll();
            l.add(root.val);
            if (root.left != null) {
                q.offer(root.left);
            }
            if (root.right != null) {
                q.offer(root.right);
            }
        }
        int len = l.size();
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            result[i] = l.get(i);
        }
        return result;
    }

    public static int[] BFS_with_null(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            root = q.poll();
            l.add(root.val);
            if (root.left != null) {
                q.offer(root.left);
            }
            else if (root.val != -1){
                q.offer(new TreeNode(-1));
            }
            if (root.right != null) {
                q.offer(root.right);
            }
            else if (root.val != -1){
                q.offer(new TreeNode(-1));
            }
        }
        int len = l.size();
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            result[i] = l.get(i);
        }
        return result;
    }
}
