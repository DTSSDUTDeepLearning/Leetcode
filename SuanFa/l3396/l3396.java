package l3396;

public class l3396 {

    public int minimumOperations(int[] nums) {
        boolean[] flag = new boolean[128];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (flag[nums[i]]) {
                return i / 3 + 1;
            }
            flag[nums[i]] = true;
        }
        return 0;
    }
}
