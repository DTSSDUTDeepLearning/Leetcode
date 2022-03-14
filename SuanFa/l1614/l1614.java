package SuanFa.l1614;

public class l1614 {

    public int maxDepth(String s) {
        char[] cs = s.toCharArray();
        int dep = 0;
        int max = 0;
        for (char c : cs) {
            if (c == '(') {
                dep++;
                max = Math.max(max, dep);
            }
            else if (c == ')') {
                dep--;
            }
        }
        return max;
    }
}
