package SuanFa.l1897;

public class l1897 {

    public boolean makeEqual(String[] words) {
        int[] cnt = new int[26];
        int len = words.length;
        for (String word : words) {
            for (char c : word.toCharArray()) {
                cnt[c-'a']++;
            }
        }
        for (int i = 0;i < 26;i++) {
            if (cnt[i] % len != 0) {
                return false;
            }
        }
        return true;
    }
}
