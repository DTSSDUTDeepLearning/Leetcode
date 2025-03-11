package l2341;

public class l2341 {

    public int[] numberOfPairs(int[] nums) {
        int[] cnt = new int[101];
        for (int num : nums) {
            cnt[num]++;
        }
        int[] result = new int[2];
        for (int i = 0;i <= 100;i++) {
            result[0] += cnt[i] / 2;
            result[1] += cnt[i] % 2;
        }
        return result;
    }
}
