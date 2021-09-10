package SuanFa.l216;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class l216 {

    int[] candidate;
    int len;
    List<List<Integer>> results;
    Deque<Integer> path;
    int k;

    public void dfs(int begin, int target) {
        if (target == 0 && path.size() == k) {
            results.add(new ArrayList<>(path));
            return;
        }
        if (path.size() == k) {
            return;
        }
        for (int i = begin;i < len;i++) {
            if (target - candidate[i] < 0) {
                break;
            }
            path.push(candidate[i]);
            dfs(i+1, target-candidate[i]);
            path.poll();
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        results = new LinkedList<>();
        if (k == 0 || n == 0 || k > n) {
            return results;
        }
        this.k = k;
        candidate = new int[]{1,2,3,4,5,6,7,8,9};
        len = 9;
        path = new LinkedList<>();
        dfs(0, n);
        return results;
    }
}
