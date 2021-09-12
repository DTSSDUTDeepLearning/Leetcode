package SuanFa.l264;

public class l264_2 {

    // 使用动态规划
    public int nthUglyNumber(int n) {
        int[] result = new int[n];
        result[0] = 1;
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        for (int i = 1;i < n;i++) {
            int num2 = result[p2]*2;
            int num3 = result[p3]*3;
            int num5 = result[p5]*5;
            result[i] = Math.min(Math.min(num2, num3), num5);
            if (result[i] == num2) {
                p2++;
            }
            if (result[i] == num3) {
                p3++;
            }
            if (result[i] == num5) {
                p5++;
            }
        }
        return result[n-1];
    }
}
