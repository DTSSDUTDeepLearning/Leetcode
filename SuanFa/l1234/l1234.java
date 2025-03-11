package l1234;

public class l1234 {

    public int balancedString(String s) {
        char[] cs = s.toCharArray();
        int[] cnt = new int[26];
        for (int i = 0;i < cs.length;i++) {
            cnt[cs[i]-'A']++;
        }
        int number = cs.length / 4;
        if (check(cnt, number)) {
            return 0;
        }
        int r = 0;
        int result = cs.length;
        for (int l = 0;l < cs.length;l++) {
            while (r < cs.length && !check(cnt, number)) {
                cnt[cs[r]-'A']--;
                r++;
            }
            if (!check(cnt, number)) {
                break;
            }
            result = Math.min(result, r-l);
            cnt[cs[l]-'A']++;
        }
        return result;
    }

    public boolean check(int[] cnt, int number) {
        if (cnt['Q'-'A'] > number || cnt['W'-'A'] > number ||
            cnt['E'-'A'] > number || cnt['R'-'A'] > number) {
            return false;
        }
        else {
            return true;
        }
    }
}
