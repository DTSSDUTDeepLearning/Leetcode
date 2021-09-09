package SuanFa.l173;

import SuanFa.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BSTIterator_1 {

    // 将数通过中序遍历直接转化为数组，时间、空间复杂度均为O(n)，n为树的结点数
    private int index;
    private List<Integer> l;

    public BSTIterator_1(TreeNode root) {
        index = 0;
        l = new ArrayList<>();
        in(root, l);
    }

    public int next() {
        return l.get(index++);
    }

    public boolean hasNext() {
        return index!=l.size();
    }

    public void in(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        in(root.left, l);
        l.add(root.val);
        in(root.right, l);
    }
}
