package SuanFa.l1652;

public class l1652 {

    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] result = new int[len];
        if (k > 0) {
            int sum = 0;
            for (int i = 0;i < k;i++) {
                sum+=code[(i+1)%len];
            }
            result[0] = sum;
            for (int i = 1;i < len;i++) {
                sum-=code[i];
                sum+=code[(k+i)%len];
                result[i] = sum;
            }
        }
        else if (k < 0) {
            k = -k;
            int sum = 0;
            for (int i = 0;i < k;i++) {
                sum+=code[((-i-1)%len+len)%len];
            }
            result[0] = sum;
            for (int i = 1;i < len;i++) {
                sum-=code[((-k+i-1)%len+len)%len];
                sum+=code[(i-1)%len];
                result[i] = sum;
            }
        }
        return result;
    }
}
