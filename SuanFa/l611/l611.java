package SuanFa.l611;

import java.util.Arrays;

public class l611 {

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int result = 0;
        for (int i = 0;i < len-2;i++) {
            for (int j = i+1;j < len-1;j++) {
                int k = j+1;
                while (k < len && nums[k] < nums[i] + nums[j]) {
                    k++;
                }
                result+=(k-j-1);
            }
        }
        return result;
    }
}
