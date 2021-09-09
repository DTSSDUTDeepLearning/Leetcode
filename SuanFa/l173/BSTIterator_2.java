package SuanFa.l173;

import SuanFa.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BSTIterator_2 {

    // 将栈来实时获取数据，时间、空间复杂度均为O(n)，n为树的结点数
    private TreeNode curr;
    private Deque<TreeNode> s;

    public BSTIterator_2(TreeNode root) {
        curr = root;
        s = new LinkedList<>();
    }

    public int next() {
        while (curr != null) {
            s.push(curr);
            curr = curr.left;
        }
        curr = s.pop();
        int result = curr.val;
        curr = curr.right;
        return result;
    }

    public boolean hasNext() {
        return curr != null || !s.isEmpty();
    }
}
