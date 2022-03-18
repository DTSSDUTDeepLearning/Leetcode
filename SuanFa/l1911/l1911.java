package SuanFa.l1911;

public class l1911 {

    public long maxAlternatingSum(int[] nums) {
        int len = nums.length;
        long odd = 0;
        long even = nums[0];
        for (int i = 1;i < len;i++) {
            odd = Math.max(odd, even - nums[i]);
            even = Math.max(even, odd + nums[i]);
        }
        return even;
    }
}
