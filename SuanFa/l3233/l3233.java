package l3233;

public class l3233 {

    public int nonSpecialCount(int l, int r) {
        int n = (int)Math.sqrt(r);
        int[] v = new int[n+1];
        int result = r - l + 1;
        for (int i = 2;i <= n;i++) {
            if (v[i] == 0)  {
                if (i * i >= l && i * i <= r) {
                    result--;
                }
                for (int j = i*2;j <= n;j+=i) {
                    v[j] = 1;
                }
            }
        }
        return result;
    }
}