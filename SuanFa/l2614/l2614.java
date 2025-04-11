package l2614;

public class l2614 {

    public int diagonalPrime(int[][] nums) {
        int max = 0;
        int len = nums.length;
        for (int i = 0;i < len;i++) {
            if (isPrime(nums[i][i])) {
                max = Math.max(max, nums[i][i]);
            }
            if (isPrime(nums[i][len-i-1])) {
                max = Math.max(max, nums[i][len-i-1]);
            }
        }
        return max;
    }

    private boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        for (int i = 2;i <= Math.floor(Math.sqrt(n));i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
