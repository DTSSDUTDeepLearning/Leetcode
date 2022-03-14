package SuanFa.l1759;

public class l1759 {

    public int countHomogenous(String s) {
        int MOD = 1000000007;
        char[] cs = s.toCharArray();
        int len = cs.length;
        long sum = 0;
        int left = 0;
        long cnt = 1;
        for (int right = 1;right < len;right++) {
            if (cs[left] != cs[right]) {
                sum = (sum + (cnt+1)*cnt/2) % MOD;
                cnt = 1;
                left = right;
            }
            else {
                cnt++;
            }
        }
        sum = (sum + (cnt+1)*cnt/2) % MOD;
        return (int)sum;
    }
}
