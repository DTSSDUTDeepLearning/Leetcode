package SuanFa.l1437;

public class l1437 {

    public boolean kLengthApart(int[] nums, int k) {
        int len = nums.length;
        int i = 0;
        while (i < len && nums[i] == 0) {
            i++;
        }
        while (i < len) {
            int j = i;
            while (i < len && nums[i] == 0) {
                i++;
            }
            if (i < len && i-j-1 < k) {
                return false;
            }
        }
        return true;
    }
}
