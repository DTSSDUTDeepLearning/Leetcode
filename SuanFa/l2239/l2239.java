package l2239;

public class l2239 {

    public int findClosestNumber(int[] nums) {
        int result = 100000+1;
        for (int num : nums) {
            if (Math.abs(result) > Math.abs(num)) {
                result = num;
            }
            else if (Math.abs(result) == Math.abs(num))
            {
                result = Math.max(result, num);
            }
        }
        return result;
    }
}