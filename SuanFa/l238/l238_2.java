package SuanFa.l238;

public class l238_2 {

    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] lefts = new int[len];
        int left = 1;
        int right = 1;
        for (int i = 0;i < len;i++) {
            lefts[i] = left;
            left*=nums[i];
        }
        for (int i = len-1;i >= 0;i--) {
            lefts[i]*=right;
            right*=nums[i];
        }
        return lefts;
    }
}
