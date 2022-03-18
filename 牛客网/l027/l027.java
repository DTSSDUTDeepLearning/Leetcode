package NowCoder.l027;

import java.util.*;

public class l027 {

    int len;
    int[] nums;
    ArrayList<ArrayList<Integer>> results;
    ArrayList<Integer> l;

    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        len = S.length;
        results = new ArrayList<>();
        if (len == 0) {
            return results;
        }
        l = new ArrayList<>();
        Arrays.sort(S);
        nums = S;
        dfs(0);
        return results;
    }

    public void dfs(int begin) {
        if (begin == len) {
            results.add(new ArrayList<>(l));
            return;
        }
        dfs(begin + 1);
        l.add(nums[begin]);
        dfs(begin + 1);
        l.remove(l.size() - 1);
    }
}
