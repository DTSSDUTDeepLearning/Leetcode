package SuanFa.l1262;

public class l1262 {

    public int maxSumDivThree(int[] nums) {
        int[] result = new int[3];
        for (int num : nums) {
            int a = result[0] + num;
            int b = result[1] + num;
            int c = result[2] + num;
            result[a%3] = Math.max(result[a%3], a);
            result[b%3] = Math.max(result[b%3], b);
            result[c%3] = Math.max(result[c%3], c);
        }
        return result[0];
    }
}
