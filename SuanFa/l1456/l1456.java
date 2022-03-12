package SuanFa.l1456;

public class l1456 {

    public int maxVowels(String s, int k) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        boolean[] flag = new boolean[len];
        int cnt = 0;
        for (int i = 0;i < k;i++) {
            if (isaeiov(cs[i])) {
                flag[i] = true;
                cnt++;
            }
        }
        int max = cnt;
        for (int i = k;i < len;i++) {
            flag[i] = isaeiov(cs[i]);
            if (flag[i-k]) {
                cnt--;
            }
            if (flag[i]) {
                cnt++;
                max = Math.max(max, cnt);
            }
        }
        return max;
    }

    public boolean isaeiov(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        else {
            return false;
        }
    }
}
