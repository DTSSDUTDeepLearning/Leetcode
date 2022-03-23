package NowCoder.l136;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l136 {

    public static TreeNode build(int[] preorder, int[] inorder, int lp, int rp, int li, int ri) {
        if (lp > rp) {
            return null;
        }
        int r = preorder[lp];
        TreeNode root = new TreeNode(r);
        if (lp == rp) {
            return root;
        }
        if (lp == rp-1) {
            if (preorder[lp] != inorder[li]) {
                root.left = new TreeNode(preorder[rp]);
            }
            else {
                root.right = new TreeNode(preorder[rp]);
            }
            return root;
        }
        int mid = li;
        while (inorder[mid] != r) {
            mid++;
        }
        root.left = build(preorder, inorder, lp+1, lp+mid-li, li, mid-1);
        root.right = build(preorder, inorder, lp+mid-li+1, rp, mid+1, ri);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, preorder.length-1, 0, preorder.length-1);
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0;i < len-1;i++) {
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            TreeNode node = q.poll();
            result.add(node.val);
            if (node.left != null) {
                q.offer(node.left);
            }
            if (node.right != null) {
                q.offer(node.right);
            }
        }
        return result;
    }

    public int[] solve (int[] xianxu, int[] zhongxu) {
        List<Integer> l = rightSideView(buildTree(xianxu, zhongxu));
        int len = l.size();
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            result[i] = l.get(i);
        }
        return result;
    }
}
