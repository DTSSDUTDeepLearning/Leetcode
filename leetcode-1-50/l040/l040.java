package SuanFa.l040;

import java.util.*;

public class l040 {

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
            if (!(i > begin && candidates[i] == candidates[i-1])) {
                path.push(candidates[i]);
                dfs(i+1, target-candidates[i], path);
                path.poll();
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.candidates = candidates;
        len = candidates.length;
        results = new LinkedList<>();
        Arrays.sort(candidates);
        Deque<Integer> path = new LinkedList<>();
        dfs(0, target, path);
        return results;
    }
}
