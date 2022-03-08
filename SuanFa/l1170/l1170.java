package SuanFa.l1170;

public class l1170 {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] cnt = new int[10];
        for (String word : words) {
            cnt[f(word)-1]++;
        }
        for (int i = 8;i >= 0;i--) {
            cnt[i]+=cnt[i+1];
        }
        int len = queries.length;
        int[] results = new int[len];
        for (int i = 0;i < len;i++) {
            results[i] = cnt[f(queries[i])-1];
        }
        return results;
    }

    public int f(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        int mincnt = 1;
        char minchar = cs[0];
        for (int i = 1;i < len;i++) {
            if (minchar == cs[i]) {
                mincnt++;
            }
            else if (minchar > cs[i]) {
                mincnt = 1;
                minchar = cs[i];
            }
        }
        return mincnt;
    }
}
