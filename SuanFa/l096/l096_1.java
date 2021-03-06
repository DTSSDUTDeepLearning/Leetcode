package SuanFa.l096;

public class l096_1 {

    // 迭代法
    public int numTrees(int n) {
        int[] f = new int[n+1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2;i <= n;i++) {
            for (int j = 1;j <= i;j++) {
                f[i] += f[j-1] * f[i-j];
            }
        }
        return f[n];
    }
}
