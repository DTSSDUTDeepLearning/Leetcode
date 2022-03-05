package SuanFa.l953;

public class l953 {

    public boolean isAlienSorted(String[] words, String order) {
        int[] dic = new int[26];
        char[] cs = order.toCharArray();
        for (int i = 0;i < 26;i++) {
            dic[cs[i]-'a'] = i;
        }
        int len = words.length;
        for (int i = 0;i < len-1;i++) {
            char[] words1 = words[i].toCharArray();
            char[] words2 = words[i+1].toCharArray();
            int len1 = words[i].length();
            int len2 = words[i+1].length();
            int min_len = Math.min(len1, len2);
            int flag = 0;
            for (int j = 0;j < min_len;j++) {
                if (dic[words1[j]-'a'] < dic[words2[j]-'a']) {
                    flag = 1;
                    break;
                }
                else if (dic[words1[j]-'a'] > dic[words2[j]-'a']) {
                    flag = -1;
                    break;
                }
            }
            if (flag == -1 || (flag == 0 && len1 > len2)) {
                return false;
            }
        }
        return true;
    }
}
