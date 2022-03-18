package SuanFa.l1991;

public class l1991 {

    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum+=num;
        }
        if (sum == nums[0]) {
            return 0;
        }
        int len = nums.length;
        int sum_left = nums[0];
        for (int i = 1;i < len;i++) {
            if (sum_left * 2 == sum - nums[i]) {
                return i;
            }
            sum_left+=nums[i];
        }
        return -1;
    }
}
