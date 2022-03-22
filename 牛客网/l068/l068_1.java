package NowCoder.l068;

public class l068_1 {

    //迭代
    public int jumpFloor(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int[] result = new int[target];
        result[0] = 1;
        result[1] = 2;
        for (int i = 2;i < target;i++) {
            result[i] = result[i-2]+result[i-1];
        }
        return result[target-1];
    }
}
