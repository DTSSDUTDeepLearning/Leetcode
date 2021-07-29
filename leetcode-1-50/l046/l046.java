package SuanFa.l046;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class l046 {

    List<List<Integer>> results;
    List<Integer> l;
    int len;
    int[] nums;
    boolean[] flag;

    public List<List<Integer>> permute(int[] nums) {
        len = nums.length;
        results = new LinkedList<>();
        l = new LinkedList<>();
        this.nums = nums;
        flag = new boolean[len];
        dfs(0);
        return results;
    }

    public void dfs(int size) {
        if (size == len) {
            results.add(new ArrayList<>(l));
            return;
        }
        for (int i = 0;i < len;i++) {
            if (!flag[i]) {
                flag[i] = true;
                l.add(nums[i]);
                dfs(size+1);
                flag[i] = false;
                l.remove(l.size()-1);
            }
        }
    }
}
