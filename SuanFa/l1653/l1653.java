package SuanFa.l1653;

public class l1653 {

    public int minimumDeletions(String s) {
        int cnt = 0;
        int max = 0;
        for (char c : s.toCharArray()) {
            if (c == 'b') {
                cnt++;
            }
            else if (cnt > 0){
                max++;
                cnt--;
            }
        }
        return max;
    }
}
