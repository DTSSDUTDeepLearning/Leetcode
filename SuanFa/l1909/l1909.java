package SuanFa.l1909;

public class l1909 {

    int[] nums;
    int len;

    public boolean canBeIncreasing(int[] nums) {
        this.nums = nums;
        len = nums.length;
        for (int i = 1;i < len;i++) {
            if (nums[i-1] >= nums[i]) {
                return check(i-1) || check(i);
            }
        }
        return true;
    }

    public boolean check(int k) {
        if (k == len-1) {
            return true;
        }
        if (k != 0) {
            if (nums[k-1] >= nums[k+1]) {
                return false;
            }
            for (int i = k+2;i < len;i++) {
                if (nums[i-1] >= nums[i]) {
                    return false;
                }
            }
            return true;
        }
        else {
            for (int i = 2;i < len;i++) {
                if (nums[i-1] >= nums[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
