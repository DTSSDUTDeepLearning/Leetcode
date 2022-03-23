package NowCoder.l101;

public class l101 {

    public int solve (int[] a) {
//        int n = a.length;
//        int sum = 0;
//        for (int i = 0;i < n;i++) {
//            sum+=(a[i]-i);
//        }
//        return n-sum;
        int n = a.length;
        for (int i = 0;i < n;i++) {
            if (a[i] != i) {
                return i;
            }
        }
        return n;
    }
}
