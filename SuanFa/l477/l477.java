package SuanFa.l477;

public class l477 {

    public int totalHammingDistance(int[] nums) {
        int len = nums.length;
        int result = 0;
        for (int i = 0;i < 30;i++) {
            int c = 0;
            for (int num : nums) {
                c += (num >> i) & 1;
            }
            result += c * (len - c);
        }
        return result;
    }
}
