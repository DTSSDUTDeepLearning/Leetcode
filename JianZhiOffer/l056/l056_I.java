package JianZhiOffer.l056;

public class l056_I {

    public int[] singleNumbers(int[] nums) {
        int x = 0;
        for (int num : nums) {
            x ^= num;
        }
        int d = 1;
        while ((d & x) == 0) {
            d <<= 1;
        }
        int m = 0;
        int n = 0;
        for (int num : nums) {
            if ((d & num) == 0) {
                m ^= num;
            }
            else {
                n ^= num;
            }
        }
        return new int[]{m, n};
    }
}
