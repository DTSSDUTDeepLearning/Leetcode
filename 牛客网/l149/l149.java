package NowCoder.l149;

public class l149 {

    public int kmp (String S, String T) {
        int[] next = next(S);
        int start = 0;
        int cnt = 0;
        while (true) {
            start = KMP(T, S, next, start)+1;
            if (start == 0) {
                break;
            }
            cnt++;
        }
        return cnt;
    }

    public int KMP(String T, String P, int[] next, int start) {
        char[] ts = T.toCharArray();
        char[] ps = P.toCharArray();
        int tlen = ts.length;
        int plen = ps.length;
        int last = tlen - plen;
        if (last - start < 0) {
            return -1;
        }
        int j = 0;
        for (int i = start;i < tlen;i++) {
            while (j > 0 && ps[j] != ts[i]) {
                j = next[j-1];
            }
            if (ps[j] == ts[i]) {
                j++;
            }
            if (j == plen) {
                return i-j+1;
            }
        }
        return -1;
    }

    public int[] next(String P) {
        char[] ps = P.toCharArray();
        int len = ps.length;
        int[] results = new int[len];
        results[0] = 0;
        for (int i = 1;i < len;i++) {
            int k = results[i-1];
            if (ps[i]==ps[k]) {
                results[i] = k+1;
            }
            else if (k != 0) {
                results[i] = results[k-1];
            }
            else {
                results[i] = 0;
            }
        }
        return results;
    }
}
