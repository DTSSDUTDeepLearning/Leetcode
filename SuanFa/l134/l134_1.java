package SuanFa.l134;

public class l134_1 {

    // 暴力模拟，时间较慢
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        for (int i = 0;i < len;i++) {
            if (gas[i] >= cost[i]) {
                int currgas = 0;
                boolean flag = false;
                for (int j = i;j < len;j++) {
                    currgas += (gas[j]-cost[j]);
                    if (currgas < 0) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    continue;
                }
                for (int j = 0;j < i;j++) {
                    currgas += (gas[j]-cost[j]);
                    if (currgas < 0) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    continue;
                }
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] gas1 = {1,2,3,4,5};
        int[] cost1 = {3,4,5,1,2};
        int[] gas2 = {2,3,4};
        int[] cost2 = {3,4,3};
        int[] gas3 = {5,1,2,3,4};
        int[] cost3 = {4,4,1,5,1};
        System.out.println(canCompleteCircuit(gas1, cost1));
        System.out.println(canCompleteCircuit(gas2, cost2));
        System.out.println(canCompleteCircuit(gas3, cost3));
    }
}
