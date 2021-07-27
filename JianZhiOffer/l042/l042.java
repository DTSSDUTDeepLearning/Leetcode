package JianZhiOffer.l042;

public class l042 {

    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int pre = nums[0];
        int max = pre;
        for (int i = 1;i < len;i++) {
            pre = Math.max(pre+nums[i], nums[i]);
            max = Math.max(max, pre);
        }
        return max;
    }
}
