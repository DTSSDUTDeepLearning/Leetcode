package SuanFa.l1317;

public class l1317 {

    public int[] getNoZeroIntegers(int n) {
        for (int i = 1;i < n;i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(n-i);
            if (sb.toString().indexOf('0') == -1) {
                return new int[]{i, n-i};
            }
        }
        return new int[]{1, n-1};
    }
}
