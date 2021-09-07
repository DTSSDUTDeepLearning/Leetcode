package SuanFa.l076;

public class l076 {

    public String minWindow(String s, String t) {
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        int slen = ss.length;
        int tlen = ts.length;
        int[] tnum = new int['z'+1];
        for (char c : ts) {
            tnum[c]++;
        }
        int l = 0;
        int min_size = Integer.MAX_VALUE;
        int cnt = tlen;
        int start = 0;
        for (int r = 0;r < slen;r++) {
            if (tnum[ss[r]] > 0) {
                cnt--;
            }
            tnum[ss[r]]--;
            if (cnt == 0) {
                while (l < r && tnum[ss[l]] < 0) {
                    tnum[ss[l++]]++;
                }
                if (r - l + 1 < min_size) {
                    min_size = r - l + 1;
                    start = l;
                }
                tnum[ss[l++]]++;
                cnt = 1;
            }
        }
        return min_size == Integer.MAX_VALUE ? "" : s.substring(start, start+min_size);
    }
}
