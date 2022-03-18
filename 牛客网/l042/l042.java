package NowCoder.l042;

import java.util.*;

public class l042 {

    int[] nums;
    int len;
    ArrayList<ArrayList<Integer>> results;
    ArrayList<Integer> l;
    boolean[] flag;

    public ArrayList<ArrayList<Integer>> permuteUnique(int[] nums) {
        len = nums.length;
        results = new ArrayList<>();
        Arrays.sort(nums);
        l = new ArrayList<>();
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
