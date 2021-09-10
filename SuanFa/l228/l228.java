package SuanFa.l228;

import java.util.ArrayList;
import java.util.List;

public class l228 {

    public List<String> summaryRanges(int[] nums) {
        List<String> results = new ArrayList<>();
        int len = nums.length;
        if (len == 0) {
            return results;
        }
        int left = 0;
        String result;
        for (int i = 1;i < len;i++) {
            if (nums[i]-1 != nums[i-1]) {
                if (i-1 != left) {
                    result = nums[left]+"->"+nums[i-1];
                }
                else {
                    result = String.valueOf(nums[left]);
                }
                results.add(result);
                left = i;
            }
        }
        if (left != len-1) {
            result = nums[left]+"->"+nums[len-1];
        }
        else {
            result = String.valueOf(nums[left]);
        }
        results.add(result);
        return results;
    }
}
