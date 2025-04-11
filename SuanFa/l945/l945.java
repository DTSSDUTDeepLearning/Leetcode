package l945;

public class l945 {

    public int minIncrementForUnique(int[] nums) {
        final int MAX = 1000000;
        int[] cnt = new int[MAX];
        for (int num : nums) {
            cnt[num]++;
        }

        int extra = 0;
        int result = 0;
        for (int i = 0;i <= MAX;i++) {
            if (cnt[i] > 1) {
                extra += cnt[i] - 1;
                result -= i * (cnt[i] - 1);
            }
            else if (extra > 0 && cnt[i] == 0) {
                extra --;
                result += i;
            }
        }
        return result;
    }
}
