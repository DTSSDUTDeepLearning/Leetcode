package SuanFa.l1822;

public class l1822 {

    public int arraySign(int[] nums) {
        boolean flag = true;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            else if (num < 0) {
                flag = !flag;
            }
        }
        return flag?1:-1;
    }
}
