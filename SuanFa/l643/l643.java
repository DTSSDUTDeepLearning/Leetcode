package SuanFa.l643;

public class l643 {

    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int sum = 0;
        for (int i = 0;i < k;i++) {
            sum+=nums[i];
        }
        int max = sum;
        for (int i = 1;i <= len-k;i++) {
            sum-=nums[i-1];
            sum+=nums[i-1+k];
            if (max < sum) {
                max = sum;
            }
        }
        return (double)max / (double)k;
    }
}
