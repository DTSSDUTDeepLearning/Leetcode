package l3232;

public class l3232 {

    public boolean canAliceWin(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = num < 10 ? sum+num : sum-num;
        }
        return sum != 0;
    }
}
