package NowCoder.l034;

public class l034 {

    public int uniquePaths (int m, int n) {
        if (m > n) {
            return uniquePaths(n, m);
        }
        int[] results = new int[m];
        for (int i = 0;i < m;i++) {
            results[i] = 1;
        }
        for (int j = 1;j < n;j++) {
            for (int i = 1;i < m;i++) {
                results[i]+=results[i-1];
            }
        }
        return results[m-1];
    }
}
