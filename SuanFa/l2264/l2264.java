package l2264;

public class l2264 {

    public String largestGoodInteger(String num) {
        char[] cs = num.toCharArray();
        int max = '0'-1;
        for (int i = 0;i < cs.length-2;i++) {
            if (cs[i] == cs[i+1] && cs[i+1] == cs[i+2]) {
                max = Math.max(max, cs[i]);
            }
        }
        if (max != '0' - 1) {
            char cMax = (char)max;
            String result = String.valueOf(cMax);
            for (int i = 0;i < 2;i++) {
                result+=String.valueOf(cMax);
            }
            return result;
        }
        else {
            return "";
        }
    }
}