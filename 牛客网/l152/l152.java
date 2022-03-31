package NowCoder.l152;

public class l152 {

    public static int divideNumber (int n, int k) {
        int[][] results = new int[n+1][k+1];
        results[0][0] = 1;
        for(int i = 0;i <=n;i++){
            for(int j = 1;j <= i && j <= k;j++){
                results[i][j] = results[i-1][j-1] + results[i-j][j];
            }
        }
        return results[n][k];
    }

    public static void main(String[] args) {
        int n1 = 7;
        int k1 = 3;
        int n2 = 6;
        int k2 = 4;
        System.out.println(divideNumber(n1, k1));
        System.out.println(divideNumber(n2, k2));
    }
}
