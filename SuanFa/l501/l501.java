package SuanFa.l501;

import SuanFa.TreeNode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class l501 {

    int number;
    int cnt;
    int max_cnt;
    List<Integer> l;

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        l = new LinkedList<>();
        number = 0;
        cnt = 0;
        max_cnt = 0;
        dfs(root);
        int len = l.size();
        int[] result = new int[len];
        Iterator<Integer> iter = l.listIterator();
        for (int i = 0;i < len;i++) {
            result[i] = iter.next();
        }
        return result;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (root.val == number) {
            cnt++;
        }
        else {
            cnt = 1;
            number = root.val;
        }
        if (cnt == max_cnt) {
            l.add(number);
        }
        else if (cnt > max_cnt) {
            max_cnt = cnt;
            l.clear();
            l.add(number);
        }
        dfs(root.right);
    }

}
