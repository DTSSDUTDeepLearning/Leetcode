package MianShiTi.t01.l001;

public class l001 {

    public boolean isUnique(String astr) {
        int[] cnt = new int[26];
        for (char c : astr.toCharArray()) {
            if (cnt[c-'a'] == 1) {
                return false;
            }
            cnt[c-'a']++;
        }
        return true;
    }
}
