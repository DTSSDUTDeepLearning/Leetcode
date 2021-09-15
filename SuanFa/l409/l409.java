package SuanFa.l409;

public class l409 {

    public int longestPalindrome(String s) {
        int[] cnt = new int[52];
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                cnt[c-'a'+26]++;
            }
            else {
                cnt[c-'A']++;
            }
        }
        int count = 0;
        for (int i = 0;i < 52;i++) {
            count += (cnt[i] % 2);
        }
        return count == 0 ? s.length() : (s.length() - count + 1);
    }
}
