package MianShiTi.t01.l003;

public class l003 {

    public String replaceSpaces(String S, int length) {
        char[] cs = S.toCharArray();
        int index = cs.length - 1;
        for (int i = length-1;i >= 0;i--) {
            if (cs[i] == ' ') {
                cs[index--] = '0';
                cs[index--] = '2';
                cs[index--] = '%';
            }
            else {
                cs[index--] = cs[i];
            }
        }
        return new String(cs, index + 1, cs.length - index - 1);
    }
}
