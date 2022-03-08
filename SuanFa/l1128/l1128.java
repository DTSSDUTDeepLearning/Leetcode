package SuanFa.l1128;

public class l1128 {

    public int numEquivDominoPairs(int[][] dominoes) {
        int[] cnt = new int[100];
        int result = 0;
        for (int[] dominoe : dominoes) {
            int num;
            if (dominoe[0] >= dominoe[1]) {
                num = dominoe[0]*10+dominoe[1];
            }
            else {
                num = dominoe[1]*10+dominoe[0];
            }
            result+=cnt[num];
            cnt[num]++;
        }
        return result;
    }
}
