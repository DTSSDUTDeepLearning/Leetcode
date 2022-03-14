package SuanFa.l1781;

public class l1781 {

    public int beautySum(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        int sum = 0;
        for (int i = 0;i < len-1;i++) {
            int[] cnt = new int[26];
            cnt[cs[i]-'a'] = 1;
            for (int j = i+1;j < len;j++) {
                cnt[cs[j]-'a']++;
                int max = -1;
                int min = len;
                for (int k = 0;k < 26;k++) {
                    if (cnt[k] != 0) {
                        max = Math.max(max, cnt[k]);
                        min = Math.min(min, cnt[k]);
                    }
                }
                sum += (max - min);
            }
        }
        return sum;
    }
}
