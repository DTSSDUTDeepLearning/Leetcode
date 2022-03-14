package SuanFa.l1646;

public class l1646 {

    public int getMaximumGenerated(int n) {
        if (n < 2) {
            return n;
        }
        int[] nums = new int[n+1];
        for (int i = 0;i < 2;i++) {
            nums[i] = i;
        }
        int max = 1;
        for (int i = 2;i < n+1;i++) {
            if (i % 2 == 0) {
                nums[i] = nums[i/2];
            }
            else {
                nums[i] = nums[i/2]+nums[i/2+1];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
