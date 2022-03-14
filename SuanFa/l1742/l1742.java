package SuanFa.l1742;

public class l1742 {

    public int countBalls(int lowLimit, int highLimit) {
        int[] cnt = new int[45];
        int tmp = lowLimit;

        int sum = 0;
        while (tmp != 0) {
            sum += tmp%10;
            tmp /= 10;
        }
        cnt[sum-1]++;
        for (int i = lowLimit +1; i <= highLimit; i++) {
            if ((i - 1) % 10 == 9) {
                sum = sum + 1 - cal(i-1)*9;
                cnt[sum-1]++;
            }
            else {
                cnt[sum++]++;
            }
        }
        int max = -1;
        for (int i = 0;i < 45;i++) {
            if (max < cnt[i]) {
                max = cnt[i];
            }
        }
        return max;
    }

    public int cal(int num) {
        int cnt = 0;
        while (num % 10 == 9) {
            cnt++;
            num /= 10;
        }
        return cnt;
    }
}
