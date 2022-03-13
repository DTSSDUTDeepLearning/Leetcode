package SuanFa.l1529;

public class l1529 {

    public int minFlips(String target) {
        char c1 = '0';
        int cnt = 0;
        for (char c2 : target.toCharArray()) {
            if (c1 != c2) {
                cnt++;
                c1 = c2;
            }
        }
        return cnt;
    }
}
