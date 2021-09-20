package SuanFa.l674;

public class l674 {

    public int findLengthOfLCIS(int[] nums) {
        int left = 0;
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int result = 1;
        for (int i = 0;i < len-1;i++) {
            if (nums[i] >= nums[i+1]) {
                result = Math.max(result, i-left+1);
                left = i+1;
            }
        }
        result = Math.max(result, len-left);
        return result;
    }
}
