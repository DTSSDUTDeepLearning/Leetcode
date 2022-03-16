package SuanFa.l1864;

public class l1864 {

    public int minSwaps(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;

        int time1 = 0;
        int time0 = 0;
        int num0 = 0;
        int num1 = 0;
        for (int i = 0;i < len;i++) {
            if (cs[i] == '1') {
                num1++;
                if (i % 2 != 0) {
                    time1++;
                }
                else {
                    time0++;
                }
            }
            else {
                num0++;
                if (i % 2 == 0) {
                    time1++;
                }
                else {
                    time0++;
                }
            }
        }
        if (num1 == num0) {
            return Math.min(time0, time1) / 2;
        }
        else if (num0 == num1 - 1) {
            return time1 / 2;
        }
        else if (num1 == num0 - 1) {
            return time0 / 2;
        }
        else {
            return -1;
        }
    }
}
