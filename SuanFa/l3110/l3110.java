package l3110;

public class l3110 {

    public int scoreOfString(String s) {
        char[] cs = s.toCharArray();
        int sum = 0;
        for (int i = 1;i < cs.length;i++) {
            sum += Math.abs(cs[i-1]-cs[i]);
        }
        return sum;
    }
}
