package SuanFa.l137;

public class l137 {

    public int singleNumber(int[] nums) {
        int once = 0;
        int twice = 0;
        for (int num : nums) {
            once = ~twice & (once ^ num);
            twice = ~once & (twice ^ num);
        }
        return once;
    }
}
