package SuanFa.l1712;

public class l1712 {

    public int waysToSplit(int[] nums) {
        int MOD = 1000000007;
        int len = nums.length;
        for (int i = 1;i < len;i++) {
            nums[i]+=nums[i-1];
        }
        long cnt = 0;
        int last = nums[len-1];
        for (int i = 0;i < len-2 && 3 * nums[i] <= last;i++) {
            int left = find_left(nums, i);
            int right = find_right(nums, i);
            if (right > left) {
                cnt = (cnt + right - left) % MOD;
            }
        }
        return (int)cnt;
    }

    public int find_left(int[] nums, int a) {
        int left = a+1;
        int right = nums.length-2;
        int value = 2 * nums[a];
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (nums[mid] >= value) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        return left;
    }

    public int find_right(int[] nums, int a) {
        int left = a+1;
        int right = nums.length-2;
        int value = nums[right+1] + nums[a];
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (2 * nums[mid] <= value) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
        }
        return left;
    }
}