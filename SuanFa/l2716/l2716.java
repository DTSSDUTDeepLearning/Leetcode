package l2716;

public class l2716 {

    public int minimizedStringLength(String s) {
        char[] cs = s.toCharArray();
        int[] cnt = new int[26];
        for (char c : cs) {
            cnt[c-'a']++;
        }
        int result = 0;
        for (int x : cnt) {
            if (x != 0) {
                result++;
            }
        }
        return result;
    }
}
