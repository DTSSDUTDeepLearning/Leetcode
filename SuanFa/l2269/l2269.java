package l2269;

public class l2269 {

    public int divisorSubstrings(int num, int k) {
        char[] cs = String.valueOf(num).toCharArray();
        int pow = 1;
        for (int i = 1;i < k;i++) {
            pow *= 10;
        }
        int subNum = 0;
        for (int i = 0;i < k;i++) {
            subNum = subNum * 10 + cs[i] - '0';
        }
        int cnt = ifBeautiful(num, subNum) ? 1 : 0;
        for (int i = 0;i < cs.length-k;i++) {
            subNum = (subNum - (cs[i]-'0')*pow)*10+cs[i+k]-'0';
            cnt += ifBeautiful(num, subNum) ? 1 : 0;
        }
        return cnt;
    }

    private boolean ifBeautiful(int num, int subNum) {
        return subNum != 0 && num % subNum == 0;
    }
}
