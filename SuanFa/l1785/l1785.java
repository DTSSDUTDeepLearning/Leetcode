package SuanFa.l1785;

public class l1785 {

    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int num : nums) {
            sum+=num;
        }
        if (sum < goal) {
            return (int)((goal - sum - 1) / limit + 1);
        }
        else if (sum == goal) {
            return 0;
        }
        else {
            return (int)((sum - goal - 1) / limit + 1);
        }
    }
}
