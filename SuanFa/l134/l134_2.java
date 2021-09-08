package SuanFa.l134;

public class l134_2 {

    // 使用数学方法，证明了：如果从加油站x不能到达加油站y，那么x到y中间的任意一个加油站，也不能到达加油站y。
    // 那么可以从加油站0开始，若它能环绕一圈，那么代表可以环绕；否则的话，若其到不了加油站i，则从加油站i开始继续进行上述判断
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int i = 0;
        while (i < len) {
            int currgas = 0;
            int cnt = 0;
            while (cnt < len) {
                int j = (i+cnt)%len;
                currgas += (gas[j]-cost[j]);
                if (currgas < 0) {
                    break;
                }
            }
            if (cnt == len) {
                return i;
            }
            else {
                i = i+cnt+1;
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
