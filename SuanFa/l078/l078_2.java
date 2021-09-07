package SuanFa.l078;

import java.util.LinkedList;
import java.util.List;

public class l078_2 {

    // 递归，时间快，空间差不多
    List<Integer> l = new LinkedList<>();
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        recursion(0, nums);
        return result;
    }

    public void recursion(int x, int[] nums) {
        if (x == nums.length) {
            result.add(new LinkedList<>(l));
            return;
        }
        l.add(nums[x]);
        recursion(x+1, nums);
        l.remove(l.size()-1);
        recursion(x+1, nums);
    }
}
