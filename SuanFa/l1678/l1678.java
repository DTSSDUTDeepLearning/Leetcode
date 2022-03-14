package SuanFa.l1678;

public class l1678 {

    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char[] cs = command.toCharArray();
        int len = cs.length;
        int i = 0;
        while (i < len) {
            if (cs[i] == 'G') {
                sb.append('G');
            }
            else if (cs[i] == '(') {
                if (cs[i+1] == ')') {
                    sb.append("o");
                    i++;
                }
                else {
                    sb.append("al");
                    i+=3;
                }
            }
            i++;
        }
        return sb.toString();
    }
}
