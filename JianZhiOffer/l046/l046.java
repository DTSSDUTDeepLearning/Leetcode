package JianZhiOffer.l046;

public class l046 {

    public int translateNum(int num) {
        char[] cs = String.valueOf(num).toCharArray();
        int len = cs.length;
        if (len == 1) {
            return 1;
        }
        if (len == 2) {
            return  (cs[0] < '2' || (cs[0]=='2' && cs[1] <= '5')) && (cs[0] >= '1')?2:1;
        }
        int a = 1;
        int b = (cs[0] < '2' || (cs[0]=='2' && cs[1] <= '5')) && (cs[0] >= '1')?2:1;
        for (int i = 2;i < len;i++) {
            int tmp = (cs[i-1] < '2' || (cs[i-1]=='2' && cs[i] <= '5')) && (cs[i-1] >= '1')?a+b:b;
            a = b;
            b = tmp;
        }
        return b;
    }
}
