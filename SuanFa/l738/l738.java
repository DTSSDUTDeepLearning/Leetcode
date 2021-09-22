package SuanFa.l738;

import java.util.LinkedList;
import java.util.List;

public class l738 {

    public static int monotoneIncreasingDigits(int N) {
        char[] cs = Integer.toString(N).toCharArray();
        int i = 1;
        int len = cs.length;
        while (i < len && cs[i-1] <= cs[i]) {
            i++;
        }
        if (i < len) {
            while (i > 0 && cs[i-1] > cs[i]) {
                cs[i-1]--;
                i--;
            }
            for (i++;i < len;i++) {
                cs[i] = '9';
            }
        }
        return Integer.parseInt(new String(cs));
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 1234;
        int n3 = 332;
        int n4 = 1112232;
        int n5 = 1232;
        System.out.println(monotoneIncreasingDigits(n1));
        System.out.println(monotoneIncreasingDigits(n2));
        System.out.println(monotoneIncreasingDigits(n3));
        System.out.println(monotoneIncreasingDigits(n4));
        System.out.println(monotoneIncreasingDigits(n5));
    }
}
