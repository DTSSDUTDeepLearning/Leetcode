package SuanFa.l062;

public class l062 {

    public static int uniquePaths(int m, int n) {
//        递归会超时
//        if (m == 1) {
//            return 1;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        else return uniquePaths(m-1, n) + uniquePaths(m, n-1);
        int[][] result = new int[m][n];
        for (int i = 0;i < m;i++) {
            result[i][0] = 1;
        }
        for (int j = 1;j < n;j++) {
            result[0][j] = 1;
        }
        for (int i = 1;i < m;i++) {
            for (int j = 1;j < n;j++) {
                result[i][j] = result[i-1][j] + result[i][j-1];
            }
        }
        return result[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
        System.out.println(uniquePaths(3, 2));
        System.out.println(uniquePaths(7, 3));
    }
}
