package SuanFa.l1790;

public class l1790 {

    public boolean areAlmostEqual(String s1, String s2) {
        char[] cs1 = s1.toCharArray();
        char[] cs2 = s2.toCharArray();
        int len = cs1.length;
        int i = 0;
        while (i < len && cs1[i] == cs2[i]) {
            i++;
        }
        if (i == len) {
            return true;
        }
        int j = i + 1;
        while (j < len && cs1[j] == cs2[j]) {
            j++;
        }
        if (j == len) {
            return false;
        }
        int k = j + 1;
        while (k < len && cs1[k] == cs2[k]) {
            k++;
        }
        return k == len && cs1[i] == cs2[j] && cs1[j] == cs2[i];
    }
}
