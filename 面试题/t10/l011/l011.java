package MianShiTi.t10.l011;

public class l011 {

    public void wiggleSort(int[] nums) {
        int len = nums.length;
        for (int i = 0;i < len-1;i++) {
            if ((i & 1) == 0) {
                if (nums[i] < nums[i+1]) {
                    int tmp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = tmp;
                }
            }
            else {
                if (nums[i] > nums[i+1]) {
                    int tmp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = tmp;
                }
            }
        }
    }
}
