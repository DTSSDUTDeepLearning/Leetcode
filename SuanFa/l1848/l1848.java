package SuanFa.l1848;

public class l1848 {

    public int getMinDistance(int[] nums, int target, int start) {
        int len = nums.length;
        int min = start + 1;
        for (int i = 0;i < len;i++) {
            if (nums[i] == target) {
                min = Math.min(min, Math.abs(i - start));
            }
        }
        return min;
    }
}
