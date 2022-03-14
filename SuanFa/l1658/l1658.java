package SuanFa.l1658;

public class l1658 {

    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for (int num : nums) {
            sum+=num;
        }
        sum -= x;
        int left = 0;
        int right = 0;
        int len = nums.length;
        int s = 0;
        int max = -1;
        while (right < len) {
            s+=nums[right++];
            if (s == sum) {
                max = Math.max(max, right-left);
            }
            else if (s > sum) {
                while (left < right && s > sum) {
                    s -= nums[left++];
                }
                if (s == sum) {
                    max = Math.max(max, right-left);
                }
            }
        }
        return max==-1?-1:len-max;
    }
}
