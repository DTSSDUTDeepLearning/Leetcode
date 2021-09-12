package SuanFa.l279;

public class l279_1 {

    // 动态规划
//    执行用时：27 ms, 在所有 Java 提交中击败了89.66%的用户
//    内存消耗：37.6 MB, 在所有 Java 提交中击败了46.46%的用户
    public int numSquares(int n) {
        int[] f = new int[n+1];
        f[0] = 0;
        for (int i = 1;i <= n;i++) {
            int min = n;
            for (int j = 1;j * j <= i;j++) {
                min = Math.min(min, f[i - j*j]);
            }
            f[i] = min + 1;
        }
        return f[n];
    }
}
