package l3254;

public class l3254 {

    public int[] resultsArray(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }
        int length = nums.length;
        int[] results = new int[length-k+1];
        int lastLength = 1;
        boolean flag = true;
        for (int i = 0;i < k-1;i++) {
            if (nums[i] != nums[i+1] - 1) {
                flag = false;
                lastLength = 1;
            }
            else {
                lastLength++;
            }
        }
        results[0] = flag ? nums[k-1] : -1;

        for (int i = k-1;i < length-1;i++) {
            if (nums[i] != nums[i+1] - 1) {
                results[i-k+2] = -1;
                lastLength = 1;
            }
            else {
                lastLength++;
                if (lastLength >= k) {
                    results[i-k+2] = nums[i+1];
                }
                else {
                    results[i-k+2] = -1;
                }
            }
        }
        return results;
    }
}