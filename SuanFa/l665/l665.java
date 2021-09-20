package SuanFa.l665;

public class l665 {

    public boolean checkPossibility(int[] nums) {
        int len = nums.length;
        int cnt = 0;
        for (int i = 0;i < len-1;i++) {
            if (nums[i] > nums[i+1]) {
                cnt++;
                if (cnt > 1) {
                    return false;
                }
                if (i > 0 && nums[i+1] < nums[i-1]) {
                    nums[i+1] = nums[i];
                }
            }
        }
        return true;
    }
}
