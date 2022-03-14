package SuanFa.l1760;

public class l1760 {

    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = 0;
        for (int num : nums) {
            right = Math.max(right, num);
        }
        int mid = left + (right - left) / 2;
        while (left <= right) {
            long sum = 0;
            for (int num : nums) {
                sum += (num - 1) / mid;
            }
            if (sum <= maxOperations) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        return left;
    }
}
