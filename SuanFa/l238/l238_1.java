package SuanFa.l238;

public class l238_1 {

    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] lefts = new int[len];
        int[] rights = new int[len];
        int left = 1;
        int right = 1;
        for (int i = 0;i < len;i++) {
            lefts[i] = left;
            rights[len-1-i] = right;
            left*=nums[i];
            right*=nums[len-1-i];
        }
        for (int i = 0;i < len;i++) {
            lefts[i]*=rights[i];
        }
        return lefts;
    }
}
