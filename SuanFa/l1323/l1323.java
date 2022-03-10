package SuanFa.l1323;

public class l1323 {

    public int maximum69Number (int num) {
        char[] cs = String.valueOf(num).toCharArray();
        int len = cs.length;
        for (int i = 0;i < len;i++) {
            if (cs[i] == '6') {
                cs[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(cs));
    }
}
