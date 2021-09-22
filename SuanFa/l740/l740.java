package SuanFa.l740;

public class l740 {

    public int deleteAndEarn(int[] nums) {
        int[] sum = new int[10001];
        int max = 0;
        for (int num : nums) {
            sum[num]++;
            max = Math.max(max, num);
        }
        if (max == 1) {
            return sum[1];
        }
        if (max == 2) {
            return Math.max(sum[1], sum[2]*2);
        }
        int first = sum[1];
        int second = sum[2]*2;
        for (int i = 3;i <= max;i++) {
            int tmp = second;
            second = Math.max(first+sum[i]*i, second);
            first = tmp;
        }
        return second;
    }
}
