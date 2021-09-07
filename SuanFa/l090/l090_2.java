package SuanFa.l090;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class l090_2 {

    // 递归，时间快，空间差不多
    List<Integer> l = new LinkedList<>();
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        recursion(0, nums, true);
        return result;
    }

    public void recursion(int x, int[] nums, boolean flag) {
        if (x == nums.length) {
            result.add(new LinkedList<>(l));
            return;
        }
        recursion(x+1, nums, true);
        if (flag && x > 0 && nums[x-1] == nums[x]) {
            return;
        }
        l.add(nums[x]);
        recursion(x+1, nums, false);
        l.remove(l.size()-1);
    }
}
