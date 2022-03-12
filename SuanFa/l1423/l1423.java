package SuanFa.l1423;

public class l1423 {

    public int maxScore(int[] cardPoints, int k) {
        int[] nums = new int[2*k];
        int len = cardPoints.length;
        for (int i = len-k;i < len;i++) {
            nums[i-(len-k)] = cardPoints[i];
        }
        for (int i = 0;i < k;i++) {
            nums[i+k] = cardPoints[i];
        }
        int sum = 0;
        for (int i = 0;i < k;i++) {
            sum+=nums[i];
        }
        int max = sum;
        for (int i = 0;i < k;i++) {
            sum-=nums[i];
            sum+=nums[i+k];
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
