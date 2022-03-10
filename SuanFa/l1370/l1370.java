package SuanFa.l1370;

public class l1370 {

    public String sortString(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        while (sb.length() < len) {
            for (int i = 0;i < 26;i++) {
                if (cnt[i] > 0) {
                    sb.append((char)(i+'a'));
                }
            }
            for (int i = 25;i >= 0;i--) {
                if (cnt[i] > 0) {
                    sb.append((char)(i+'a'));
                }
            }
        }
        return sb.toString();
    }
}
