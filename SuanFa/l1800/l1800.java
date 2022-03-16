package SuanFa.l1800;

public class l1800 {

    public int maxAscendingSum(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int left = 0;
        int sum = nums[left];
        int max = sum;
        for (int right = 1;right < len;right++) {
            if (nums[right] > nums[right-1]) {
                sum+=nums[right];
            }
            else {
                max = Math.max(max, sum);
                left = right;
                sum = nums[left];
            }
        }
        max = Math.max(max, sum);
        return max;
    }
}
