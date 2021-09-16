package SuanFa.l486;

public class l486 {

    public boolean PredictTheWinner(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            result[i] = nums[i];
        }
        for (int i = len-2;i >= 0;i--) {
            for (int j = i+1;j < len;j++) {
                result[j] = Math.max(nums[i]-result[j], nums[j]-result[j-1]);
            }
        }
        return result[len-1] >= 0;
    }
}
