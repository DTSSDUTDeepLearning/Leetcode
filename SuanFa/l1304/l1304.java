package SuanFa.l1304;

public class l1304 {

    public int[] sumZero(int n) {
        int[] result = new int[n];
        if (n % 2 == 1) {
            result[0] = 0;
            for (int i = 0;i < n/2;i++) {
                result[2*i+1] = 2*i+1;
                result[2*i+2] = -2*i-1;
            }
        }
        else {
            for (int i = 0;i < n/2;i++) {
                result[2*i] = 2*i+1;
                result[2*i+1] = -2*i-1;
            }
        }
        return result;
    }
}
