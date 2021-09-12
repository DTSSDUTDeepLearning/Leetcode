package SuanFa.l260;

public class l260 {

    public int[] singleNumber(int[] nums) {
        int x = 0;
        for (int a : nums) {
            x ^= a;
        }
        int d = 1;
        while ((d & x) == 0) {
            d <<= 1;
        }
        int m = 0;
        int n = 0;
        for (int a : nums) {
            if ((d & a) == 0) {
                m ^= a;
            }
            else {
                n ^= a;
            }
        }
        return new int[]{m, n};
    }
}
