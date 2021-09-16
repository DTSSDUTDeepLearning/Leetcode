package SuanFa.l485;

public class l485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int maxcount = 0;
        int count = 0;
        for (int i = 0;i < len;i++) {
            if (nums[i] == 1) {
                count++;
            }
            else {
                maxcount = Math.max(maxcount, count);
                count = 0;
            }
        }
        return Math.max(maxcount, count);
    }
}
