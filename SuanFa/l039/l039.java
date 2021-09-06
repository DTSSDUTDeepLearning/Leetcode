package SuanFa.l039;

import java.util.*;

public class l039 {

    int[] candidates;
    int len;
    List<List<Integer>> results;

    public void dfs(int begin, int target, Deque<Integer> path) {
        if (target == 0) {
            results.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin;i < len;i++) {
            if (target - candidates[i] < 0) {
                break;
            }
            path.push(candidates[i]);
            dfs(i, target-candidates[i], path);
            path.poll();
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        len = candidates.length;
        results = new LinkedList<>();
        Arrays.sort(candidates);
        Deque<Integer> path = new LinkedList<>();
        dfs(0, target, path);
        return results;
    }
}
