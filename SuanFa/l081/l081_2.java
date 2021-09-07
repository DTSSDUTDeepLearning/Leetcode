package SuanFa.l081;

public class l081_2 {

    // 直接循环，时间复杂度为O(n)
    public boolean search(int[] nums, int target) {
        if (nums.length == 0) {
            return false;
        }
        for (int num : nums) {
            if (target == num) {
                return true;
            }
        }
        return false;
    }
}
