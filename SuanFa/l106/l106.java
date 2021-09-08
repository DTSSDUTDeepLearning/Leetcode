package SuanFa.l106;

import SuanFa.TreeNode;

public class l106 {

    public static TreeNode build(int[] inorder, int[] postorder, int li, int ri, int lp, int rp) {
        if (lp > rp) {
            return null;
        }
        int r = postorder[rp];
        TreeNode root = new TreeNode(r);
        if (lp == rp) {
            return root;
        }
        if (lp == rp-1) {
            if (inorder[li] == postorder[lp]) {
                root.left = new TreeNode(postorder[lp]);
            }
            else {
                root.right = new TreeNode(postorder[lp]);
            }
            return root;
        }
        int mid = ri;
        while (inorder[mid] != r) {
            mid--;
        }
        if (mid == ri) {
            root.right = null;
            root.left = build(inorder, postorder, li, ri-1, lp, rp-1);
        }
        else if (mid == li) {
            root.left = null;
            root.right = build(inorder, postorder, li+1, ri, lp, rp-1);
        }
        else {
            root.left = build(inorder, postorder, li, mid-1, lp, lp+mid-li-1);
            root.right = build(inorder, postorder, mid+1, ri, lp+mid-li, rp-1);
        }
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1);
    }
}
