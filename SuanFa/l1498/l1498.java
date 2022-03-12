package SuanFa.l1498;

import java.util.Arrays;

public class l1498 {

    static int MOD = 1000000007;
    static final int MAX_N = 100005;
    int[] f = new int[MAX_N];

    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        pretreatment();
        long sum = 0;
        int len = nums.length;
        for (int i = 0;i < len && 2*nums[i]<=target;i++) {
            int index = find(nums, target-nums[i]);
            int contribute = index >= i ? f[index-i] : 0;
            sum = (sum + contribute) % MOD;
        }
        return (int)sum;
    }

    public void pretreatment() {
        f[0] = 1;
        for (int i = 1; i < MAX_N; ++i) {
            f[i] = (f[i - 1] << 1) % MOD;
        }
    }

    public int find(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        if (target > nums[right]) {
            return right;
        }
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (target == nums[mid]) {
                if (mid == nums.length-1) {
                    return mid;
                }
                else if (nums[mid] == nums[mid+1]) {
                    left = mid+1;
                }
                else {
                    return mid;
                }
            }
            else if (target < nums[mid]) {
                if (target > nums[mid-1]) {
                    return mid-1;
                }
                else {
                    right = mid-1;
                }
            }
            else {
                left = mid+1;
            }
            mid = left + (right - left) / 2;
        }
        return left;
    }
}
