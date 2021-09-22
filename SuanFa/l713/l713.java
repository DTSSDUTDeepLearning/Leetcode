package SuanFa.l713;

public class l713 {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k < 1) {
            return 0;
        }
        int len = nums.length;
        int left = 0;
        int right = 0;
        int cnt = 0;
        int mul = 1;
        while (right < len) {
            mul *= nums[right++];
            while (mul >= k && left < right) {
                mul /= nums[left++];
            }
            if (left < right) {
                cnt += (right-left+1);
            }
        }
        return cnt;
    }
}
