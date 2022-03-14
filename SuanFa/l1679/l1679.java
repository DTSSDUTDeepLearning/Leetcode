package SuanFa.l1679;

import java.util.Arrays;

public class l1679 {

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0;
        int l = 0;
        int r = nums.length - 1; // 可以通过二分法寻找r，但是我对这一题已经没有任何想法了，累了。更何况现在这样做都是100%时间
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (k == sum) {
                result++;
                l++;
                r--;
            }
            else if (k > sum) {
                l++;
            }
            else {
                r--;
            }
        }
        return result;
    }
}
