package l2873;

public class l2873_2 {

    // 遍历下标k时，不断去获取nums[i]的最大值iMax，和iMax-nums[j]的最大值ijMax，空间复杂度为O(1)
    public long maximumTripletValue(int[] nums) {
        int len = nums.length;
        long max = 0;
        int iMax = nums[0];
        int ijMax = 0;
        for (int i = 1;i < len;i++) {
            max = Math.max(max, (long)ijMax*nums[i]);
            ijMax = Math.max(ijMax, iMax-nums[i]);
            iMax = Math.max(iMax, nums[i]);
        }
        return max;
    }
}
