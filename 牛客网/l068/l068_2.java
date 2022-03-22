package NowCoder.l068;

public class l068_2 {

    //递归
    public int jumpFloor(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        return jumpFloor(target-2)+jumpFloor(target-1);
    }
}
