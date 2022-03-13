package SuanFa.l1567;

public class l1567 {

    public int getMaxLen(int[] nums) {
        int pos = 0;
        int neg = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 0) {
                pos = 0;
                neg = 0;
            }
            else if (num > 0) {
                pos++;
                if (neg != 0) {
                    neg++;
                }
            }
            else {
                int pos_tmp = pos;
                if (neg != 0) {
                    pos = neg+1;
                }
                else {
                    pos = 0;
                }
                neg = pos_tmp+1;
            }
            max = Math.max(max, pos);
        }
        return max;
    }
}
