package l2874;

public class l2874_1 {

    // 获取下标j的前缀最大值和后缀最大值，空间复杂度O(n)
    public long maximumTripletValue(int[] nums) {
        int len = nums.length;
        int[] preMax = new int[len];
        int[] postMax = new int[len];
        for (int i = 1;i < len-1;i++) {
            preMax[i] = Math.max(preMax[i-1], nums[i-1]);
        }
        for (int i = len-2;i > 0;i--) {
            postMax[i] = Math.max(postMax[i+1], nums[i+1]);
        }
        long max = 0;
        for (int i = 1;i < len-1;i++) {
            max = Math.max(max, (long)(preMax[i]-nums[i])*postMax[i]);
        }
        return max;
    }
}
