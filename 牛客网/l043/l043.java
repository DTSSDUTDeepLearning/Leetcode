package NowCoder.l043;

import java.util.ArrayList;

public class l043 {

    ArrayList<ArrayList<Integer>> results;
    ArrayList<Integer> l;
    int len;
    int[] nums;
    boolean[] flag;

    public ArrayList<ArrayList<Integer>> permute(int[] nums) {
        len = nums.length;
        results = new ArrayList<>();
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
                flag[i] = true;
                l.add(nums[i]);
                dfs(size+1);
                flag[i] = false;
                l.remove(l.size()-1);
            }
        }
    }
}
