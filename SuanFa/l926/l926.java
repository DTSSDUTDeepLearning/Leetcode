package l926;

public class l926 {

    public int minFlipsMonoIncr(String s) {
        char[] cs = s.toCharArray();
        int x0 = 0;
        int x1 = 0;
        for (char c : cs) {
            int y0 = x0;
            int y1 = Math.min(x0, x1);
            if (c == '0') {
                y1++;
            }
            else {
                y0++;
            }
            x0 = y0;
            x1 = y1;
        }
        return Math.min(x0, x1);
    }
}
