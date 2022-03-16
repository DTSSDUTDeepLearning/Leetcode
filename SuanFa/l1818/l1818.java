package SuanFa.l1818;

import java.util.Arrays;

public class l1818 {

    int[] rec;
    int len;

    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int MOD = 1000000007;
        len = nums1.length;
        int sum = 0;
        int max = 0;
        rec = new int[len];
        System.arraycopy(nums1, 0, rec, 0, len);
        Arrays.sort(rec);
        for (int i = 0;i < len;i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            sum = (sum + diff) % MOD;
            int j = find(nums2[i]);
            if (j < len) {
                max = Math.max(max, diff - (rec[j] - nums2[i]));
            }
            if (j > 0) {
                max = Math.max(max, diff - (nums2[i] - rec[j-1]));
            }
        }
        return (sum - max + MOD) % MOD;
    }

    public int find(int target) {
        int left = 0;
        int right = len - 1;
        if (rec[right] < target) {
            return len;
        }
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (rec[mid] < target) {
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
