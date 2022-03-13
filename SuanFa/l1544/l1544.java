package SuanFa.l1544;

public class l1544 {

    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (i < sb.length()-1) {
            if ((sb.charAt(i) ^ sb.charAt(i+1)) == 32) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                if (i > 0) {
                    i--;
                }
            }
            else {
                i++;
            }
        }
        return sb.toString();
    }
}
