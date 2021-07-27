package JianZhiOffer.l037;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CodeC {

    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Integer> l = new LinkedList<>();
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            l.add(node.val);
            if (node.left != null) {
                q.offer(node.left);
            }
            else if (node.val != -1001){
                q.offer(new TreeNode(-1001));
            }
            if (node.right != null) {
                q.offer(node.right);
            }
            else if (node.val != -1001){
                q.offer(new TreeNode(-1001));
            }
        }
        StringBuilder sb = new StringBuilder();
        int len = l.size();
        for (int i = 0;i < len-1;i++) {
            if (l.get(i) != -1001) {
                sb.append(l.get(i));
            }
            else {
                sb.append("None");
            }
            sb.append(",");
        }
        sb.append(l.get(len-1));
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        if (data.equals("")) {
            return null;
        }
        String[] splited = data.split(",");
        List<Integer> l = new LinkedList<>();
        for (String s : splited) {
            if (!s.equals("None")) {
                l.add(Integer.valueOf(s));
            } else {
                l.add(-1001);
            }
        }
        int len = l.size();
        TreeNode head = new TreeNode(l.get(0));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(head);
        for (int i = 1;i < len;i+=2) {
            TreeNode curr = q.poll();
            int left = l.get(i);
            int right = l.get(i+1);
            if (left != -1001) {
                curr.left = new TreeNode(left);
                q.offer(curr.left);
            }
            else {
                curr.left = null;
            }
            if (right != -1001) {
                curr.right = new TreeNode(right);
                q.offer(curr.right);
            }
            else {
                curr.right = null;
            }
        }
        return head;
    }
}
