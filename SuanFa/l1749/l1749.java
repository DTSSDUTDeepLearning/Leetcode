package SuanFa.l1749;

public class l1749 {

    public int maxAbsoluteSum(int[] nums) {
        int pos = 0;
        int neg = 0;
        int pos_max = 0;
        int neg_min = 0;
        for (int num : nums) {
            if (num >= 0) {
                pos += num;
                neg = Math.min(neg+num, 0);
            }
            else {
                neg += num;
                pos = Math.max(pos+num, 0);
            }
            pos_max = Math.max(pos, pos_max);
            neg_min = Math.min(neg, neg_min);
        }
        return Math.max(pos_max, -neg_min);
    }
}
