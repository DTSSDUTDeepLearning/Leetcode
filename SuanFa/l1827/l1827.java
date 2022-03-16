package SuanFa.l1827;

public class l1827 {

    public int minOperations(int[] nums) {
        int len = nums.length;
        int cnt = 0;
        for (int i = 1;i < len;i++) {
            if (nums[i-1] >= nums[i]) {
                cnt += nums[i-1] + 1 - nums[i];
                nums[i] = nums[i-1] + 1;
            }
        }
        return cnt;
    }
}
