package MianShiTi.t16.l011;

public class l011 {

    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter*k};
        }
        int[] result = new int[k+1];
        for (int i = 0;i <= k;i++) {
            result[i] = longer*i + shorter*(k-i);
        }
        return result;
    }
}
