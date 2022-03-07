package MianShiTi.t08.l004;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class l004 {

    List<List<Integer>> result;
    List<Integer> l;
    int len;
    int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
        result = new LinkedList<>();
        len = nums.length;
        if (len == 0) {
            return result;
        }
        this.nums = nums;
        l = new LinkedList<>();
        dfs(0);
        return result;
    }

    public void dfs(int begin) {
        if (begin == len) {
            result.add(new ArrayList<>(l));
            return;
        }
        dfs(begin+1);
        l.add(nums[begin]);
        dfs(begin+1);
        l.remove(l.size()-1);
    }
}
