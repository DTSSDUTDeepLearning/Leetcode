package SuanFa.l077;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class l077 {

    List<List<Integer>> result;
    List<Integer> l;
    int n;
    int k;
    boolean[] flag;

    public List<List<Integer>> combine(int n, int k) {
        result = new LinkedList<>();
        if (n == 0 || k == 0 || n < k) {
            return result;
        }
        l = new LinkedList<>();
        this.n = n;
        this.k = k;
        flag = new boolean[n];
        dfs(0);
        return result;
    }

    public void dfs(int begin) {
        if (l.size() == k) {
            result.add(new ArrayList<>(l));
            return;
        }
        for (int i = begin;i < n;i++) {
//        for (int i = begin;i < n-(k-l.size())+1;i++) { 剪枝版本
            if (!flag[i]) {
                flag[i] = true;
                l.add(i+1);
                dfs(i+1);
                flag[i] = false;
                l.remove(l.size()-1);
            }
        }
    }
}
