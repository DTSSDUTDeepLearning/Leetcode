package SuanFa.l645;

public class l645 {

    public int[] findErrorNums(int[] nums) {
        int miss = 0;
        int dup = 0;
        for (int num : nums) {
            if (nums[Math.abs(num)-1] < 0) {
                dup = Math.abs(num);
            }
            else {
                nums[Math.abs(num)-1]*=-1;
            }
        }
        int len = nums.length;
        for (int i = 0;i < len;i++) {
            if (nums[i] > 0) {
                miss = i+1;
            }
        }
        return new int[]{dup, miss};
    }
}
