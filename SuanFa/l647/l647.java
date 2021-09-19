package SuanFa.l647;

public class l647 {

    public int countSubstrings(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        int cnt = 0;
        for (int i = 0;i < 2*len-1;i++) {
            int left = i / 2;
            int right = left + i % 2;
            while (left >= 0 && right < len && cs[left] == cs[right]) {
                left--;
                right++;
                cnt++;
            }
        }
        return cnt;
    }
}
