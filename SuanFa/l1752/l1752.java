package SuanFa.l1752;

public class l1752 {

    public boolean check(int[] nums) {
        int len = nums.length;
        boolean flag = nums[0]>=nums[len-1];
        for (int i = 1;i < len;i++) {
            if (nums[i-1] > nums[i]) {
                if (flag) {
                    flag = false;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
