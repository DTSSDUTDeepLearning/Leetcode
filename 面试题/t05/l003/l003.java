package MianShiTi.t05.l003;

public class l003 {

    public int reverseBits(int num) {
        int never = 0;
        int once = 0;
        int max = 0;
        for (int i = 0;i++ < 32;num >>= 1) {
            if ((num & 1) == 1) {
                never++;
            }
            else {
                once = never;
                never = 0;
            }
            max = Math.max(max, once+never+1);
        }
        return max == 33 ? 32 : max;
    }
}
