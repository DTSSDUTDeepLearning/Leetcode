package SuanFa.l1513;

public class l1513 {

    public int numSub(String s) {
        int MOD = 1000000007;
        char[] cs = s.toCharArray();
        int len = cs.length;
        long i = 0;
        long sum = 0;
        while (i < len) {
            while (i < len && cs[(int)i] == '0') {
                i++;
            }
            if (i == len) {
                break;
            }
            long j = i+1;
            while (j < len && cs[(int)j] == '1') {
                j++;
            }
            sum = (sum + (j-i+1)*(j-i)/2) % MOD;
            i = j+1;
        }
        return (int)sum;
    }
}
