package SuanFaPlus.l163;

import java.util.LinkedList;
import java.util.List;

public class l163 {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new LinkedList<>();
        int len = nums.length;
        if (len == 0) {
            result.add(helper(lower-1, upper+1));
            return result;
        }
        if (lower < nums[0]) {
            result.add(helper(lower - 1, nums[0]));
        }
        for (int i = 0;i < len - 1;i++) {
            if (nums[i] + 1 != nums[i+1]) {
                result.add(helper(nums[i], nums[i+1]));
            }
        }
        if (upper > nums[len - 1]) {
            result.add(helper(nums[len-1], upper+1));
        }
        return result;
    }

    public String helper(int left, int right) {
        StringBuilder builder = new StringBuilder();
        if (left + 2 == right) builder.append(left + 1);
        else builder.append(left + 1).append("->").append(right - 1);
        return builder.toString();
    }

}
