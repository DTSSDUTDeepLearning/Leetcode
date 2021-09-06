package SuanFa.l047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class l047 {

    int[] nums;
    int len;
    List<List<Integer>> results;
    List<Integer> l;
    boolean[] flag;

    public List<List<Integer>> permuteUnique(int[] nums) {
        len = nums.length;
        results = new LinkedList<>();
        Arrays.sort(nums);
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
                if (!(i > 0 && nums[i-1] == nums[i] && !flag[i-1])) {
                    flag[i] = true;
                    l.add(nums[i]);
                    dfs(size+1);
                    flag[i] = false;
                    l.remove(l.size()-1);
                }
            }
        }
    }
}
