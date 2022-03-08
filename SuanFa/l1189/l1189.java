package SuanFa.l1189;

public class l1189 {

    public int maxNumberOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        for (char c : text.toCharArray()) {
            if (c == 'b') {
                b++;
            }
            else if (c == 'a') {
                a++;
            }
            else if (c == 'l') {
                l++;
            }
            else if (c == 'o') {
                o++;
            }
            else if (c == 'n') {
                n++;
            }
        }
        return Math.min(b, Math.min(a, Math.min(l/2, Math.min(o/2, n))));
    }
}
