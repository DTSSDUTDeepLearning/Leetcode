package SuanFa.l1979;

public class l1979 {

    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int len = nums.length;
        for (int i = 1;i < len;i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        while (min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }
        return max;
    }

}
