package SuanFa.l453;

public class l453 {

    public int minMoves(int[] nums) {
        int steps = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        for (int num : nums) {
            steps += (num - min);
        }
        return steps;
    }
}
