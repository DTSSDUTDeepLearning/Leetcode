package SuanFa.l303;

public class NumArray {

    int[] sums;

    public NumArray(int[] nums) {
        int len = nums.length;
        sums = new int[len+1];
        for (int i = 0; i < len; i++) {
            sums[i+1] = sums[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j+1] - sums[i];
    }
}
