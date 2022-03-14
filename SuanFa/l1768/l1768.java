package SuanFa.l1768;

public class l1768 {

    public String mergeAlternately(String word1, String word2) {
        char[] cs1 = word1.toCharArray();
        char[] cs2 = word2.toCharArray();
        int min_len = Math.min(cs1.length, cs2.length);
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < min_len;i++) {
            sb.append(cs1[i]);
            sb.append(cs2[i]);
        }
        if (cs1.length > min_len) {
            sb.append(word1.substring(min_len));
        }
        else {
            sb.append(word2.substring(min_len));
        }
        return sb.toString();
    }
}
