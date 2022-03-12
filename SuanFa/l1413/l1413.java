package SuanFa.l1413;

public class l1413 {

    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum+=num;
            min = Math.min(min, sum);
        }
        if (min >= 1) {
            return 1;
        }
        else {
            return 1-min;
        }
    }
}
