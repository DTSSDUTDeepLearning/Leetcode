package SuanFa.l889;

import SuanFa.TreeNode;

public class l889 {

    int[] pre, post;

    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        this.pre = pre;
        this.post = post;
        return make(0, 0, pre.length);
    }

    public TreeNode make(int i0, int i1, int N) {
        if (N == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[i0]);
        if (N == 1) {
            return root;
        }
        int i = 1;
        while (i < N && pre[i0+1] != post[i1+i-1]) {
            i++;
        }
        root.left = make(i0+1, i1, i);
        root.right = make(i0+i+1, i1+i, N-i-1);
        return root;
    }
}
