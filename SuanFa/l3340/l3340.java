package l3340;

public class l3340 {

    public boolean isBalanced(String num) {
        char[] cs = num.toCharArray();
        int sum = 0;
        for (int i = 0; i < cs.length; i++) {
            if (i % 2 == 0) {
                sum += cs[i] - '0';
            } else {
                sum -= cs[i] - '0';
            }
        }
        return sum == 0;
    }
}
