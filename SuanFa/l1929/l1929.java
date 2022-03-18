package SuanFa.l1929;

public class l1929 {

    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] result = new int[2 * len];
        for (int i = 0;i < len;i++) {
            result[i] = result[len+i] = nums[i];
        }
        return result;
    }
}
