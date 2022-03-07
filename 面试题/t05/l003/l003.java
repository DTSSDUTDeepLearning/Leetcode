package MianShiTi.t05.l003;

public class l003 {

    public int reverseBits(int num) {
        int never = 0;
        int once = 0;
        int max = 0;
        for (int i = 0;i < 32;i++) {
            if ((num & (1 << i)) == 1) {
                never++;
                once++;
            }
            else {
                once = never+1;
                never = 0;
            }
            max = Math.max(max, once);
        }
        return never == once ? max + 1 : max;
    }
}
