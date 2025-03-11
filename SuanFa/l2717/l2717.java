package l2717;

public class l2717 {

    public int semiOrderedPermutation(int[] nums) {
        int len = nums.length;
        int min = 0;
        int max = 0;
        for  (int i = 0;i < len;i++) {
            if (nums[i] == 1) {
                min = i;
            }
            if (nums[i] == len) {
                max = i;
            }
        }
        return min - max + len - 1 - (max < min ? 1 : 0);
    }
}