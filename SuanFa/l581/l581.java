package SuanFa.l581;

public class l581 {

    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int right = -1;
        int left = -1;
        for (int i = 0;i < len;i++) {
            if (max <= nums[i]) {
                max = nums[i];
            }
            else {
                right = i;
            }
            if (min >= nums[len-i-1]) {
                min = nums[len-i-1];
            }
            else {
                left = len-i-1;
            }
        }
        return right == -1 ? 0 : right-left+1;
    }
}
