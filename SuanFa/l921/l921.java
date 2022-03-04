package SuanFa.l921;

public class l921 {

    public int minAddToMakeValid(String S) {
        int left = 0;
        int cnt = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                left++;
            }
            else if (left == 0) {
                cnt++;
            }
            else {
                left--;
            }
        }
        return left+cnt;
    }
}
