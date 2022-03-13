package SuanFa.l1599;

public class l1599 {

    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        if (boardingCost*4 <= runningCost) {
            return -1;
        }
        int max = -1;
        int max_id = -1;
        int sum = 0;
        int wait = 0;
        int len = customers.length;
        for (int i = 0;i < len;i++) {
            if (wait + customers[i] > 4) {
                wait = wait + customers[i] - 4;
                sum = sum + 4*boardingCost - runningCost;
            }
            else {
                sum = sum + (wait + customers[i])*boardingCost - runningCost;
                wait = 0;
            }
            if (sum > 0 && sum > max) {
                max = sum;
                max_id = i+1;
            }
        }
        max_id += wait/4;
        if (wait % 4 >= runningCost / boardingCost + 1) {
            max_id++;
        }
        return max_id;
    }
}
