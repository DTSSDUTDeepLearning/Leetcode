package SuanFa.l1941;

public class l1941 {

    public boolean areOccurrencesEqual(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c-'a']++;
        }
        int index = 0;
        while (index < 26 && cnt[index] == 0) {
            index++;
        }
        for (int i = index+1;i < 26;i++) {
            if (cnt[i] != 0 && cnt[i] != cnt[index]) {
                return false;
            }
        }
        return true;
    }
}
