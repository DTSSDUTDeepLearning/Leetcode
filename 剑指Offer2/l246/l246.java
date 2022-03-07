package SuanFaPlus.l246;

public class l246 {

    public boolean isStrobogrammatic(String num) {
        char[] wrong = {'2','3','4','5','7'};
        char[] cs = num.toCharArray();
        int len = cs.length;
        for (char c : cs) {
            if (c == '2' || c == '3' || c == '4' || c == '5' || c == '7') {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = len-1;i >= 0;i--) {
            if (cs[i] == '0') {
                sb.append('0');
            }
            else if (cs[i] == '1') {
                sb.append('1');
            }
            else if (cs[i] == '6') {
                sb.append('9');
            }
            else if (cs[i] == '8') {
                sb.append('8');
            }
            else if (cs[i]=='9') {
                sb.append('6');
            }
        }
        return num.equals(sb.toString());
    }
}
