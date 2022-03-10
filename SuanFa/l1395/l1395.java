package SuanFa.l1395;

public class l1395 {

    public int numTeams(int[] rating) {
        int len = rating.length;
        int num = 0;
        for (int j = 1;j < len-1;j++) {
            int is = 0;
            int ib = 0;
            int ks = 0;
            int kb = 0;
            for (int i = 0;i < j;i++) {
                if (rating[i] < rating[j]) {
                    is++;
                }
                else if (rating[i] > rating[j]) {
                    ib++;
                }
            }
            for (int k = j+1;k < len;k++) {
                if (rating[k] < rating[j]) {
                    ks++;
                }
                else if (rating[k] > rating[j]) {
                    kb++;
                }
            }
            num+=is*kb+ib*ks;
        }
        return num;
    }
}
