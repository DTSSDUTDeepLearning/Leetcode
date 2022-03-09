package SuanFa.l1283;

public class l1283 {

    public int smallestDivisor(int[] nums, int threshold) {
        int right = 0;
        for (int num : nums) {
            right = Math.max(right, num);
        }
        int left = 1;
        int mid = left + (right-left)/2;
        while (left <= right) {
            if (ifcan(nums, threshold, mid)) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
            mid = left + (right-left)/2;
        }
        return left;
    }

    public boolean ifcan(int[] nums, int threshold, int div) {
        int cnt = 0;
        for (int num : nums) {
            if (num % div == 0) {
                cnt+=num/div;
            }
            else {
                cnt+=num/div+1;
            }
        }
        return cnt<=threshold;
    }
}
