package SuanFa.l1510;

public class l1510 {

    public boolean winnerSquareGame(int n) {
        boolean[] flag = new boolean[n+1];
        for (int i = 1;i <= n;i++) {
            for (int j = 1;j*j <= i;j++) {
                if (!flag[i-j*j]) {
                    flag[i] = true;
                    break;
                }
            }
        }
        return flag[n];
    }
}
