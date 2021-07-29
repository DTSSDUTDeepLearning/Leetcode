package JianZhiOffer.l053_I;

public class l053_II {

    public int missingNumber(int[] nums) {
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] == mid) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }
}
