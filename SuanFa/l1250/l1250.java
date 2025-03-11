package l1250;

public class l1250 {

    public boolean isGoodArray(int[] nums) {
        int result = nums[0];
        for (int i = 1;i < nums.length;i++) {
            result = gcd(result, nums[i]);
            if (result == 1) {
                break;
            }
        }
        return result == 1;
    }

    public int gcd(int m, int n) {
        while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}
