package SuanFa.l105;

import SuanFa.TreeNode;

public class l105 {

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
        if (mid == li) {
            root.left = null;
            root.right = build(preorder, inorder, lp+1, rp, li+1, ri);
        }
        else if (mid == ri) {
            root.right = null;
            root.left = build(preorder, inorder, lp+1, rp, li, ri-1);
        }
        else {
            root.left = build(preorder, inorder, lp+1, lp+mid-li, li, mid-1);
            root.right = build(preorder, inorder, lp+mid-li+1, rp, mid+1, ri);
        }
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, preorder.length-1, 0, preorder.length-1);
    }


}
