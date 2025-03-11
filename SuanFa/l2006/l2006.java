package l2006;

public class l2006 {

    public int countKDifference(int[] nums, int k) {
        int[] cnt = new int[101];
        int result = 0;
        for (int num : nums) {
            if (num - k >= 1) {
                result += cnt[Math.max(num-k, 1)];
            }
            if (num + k <= 100) {
                result += cnt[Math.min(num+k, 100)];
            }
            cnt[num]++;
        }
        return result;
    }
}