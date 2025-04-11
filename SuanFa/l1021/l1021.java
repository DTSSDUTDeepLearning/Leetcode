package l1021;

public class l1021 {

    public String removeOuterParentheses(String s) {
        char[] cs = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int matchCount = 0;
        for (char c : cs) {
            if (c == ')') {
                matchCount--;
            }
            if (matchCount > 0) {
                sb.append(c);
            }
            if (c == '(') {
                matchCount++;
            }
        }
        return sb.toString();
    }

}
