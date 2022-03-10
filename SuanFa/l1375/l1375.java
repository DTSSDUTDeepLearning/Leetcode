package SuanFa.l1375;

public class l1375 {

    public int numTimesAllBlue(int[] light) {
        int on_num = 0;
        int result = 0;
        int len = light.length;
        for (int i = 0;i < len;i++) {
            on_num = Math.max(on_num, light[i]);
            if (i+1 == on_num) {
                result++;
            }
        }
        return result;
    }
}
