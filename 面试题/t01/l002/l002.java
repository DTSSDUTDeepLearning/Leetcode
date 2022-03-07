package MianShiTi.t01.l002;

public class l002 {

    public boolean CheckPermutation(String s1, String s2) {
        int[] cnt = new int[26];
        for (char c : s1.toCharArray()) {
            cnt[c-'a']++;
        }
        for (char c : s2.toCharArray()) {
            if (cnt[c-'a'] == 0) {
                return false;
            }
            cnt[c-'a']--;
        }
        for (int i = 0;i < 26;i++) {
            if (cnt[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
