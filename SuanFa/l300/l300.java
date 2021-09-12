package SuanFa.l300;

public class l300 {

    public static int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int[] seq = new int[len];
        int index = 0;
        seq[index] = nums[0];
        for (int i = 1;i < len;i++) {
            if (seq[index] < nums[i]) {
                seq[++index] = nums[i];
            }
            else {
                int left = 0;
                int right = index;
                int mid = left + (right-left)/2;
                int p = 0;
                while (left <= right) {
                    if (seq[mid] >= nums[i]) {
                        p = mid;
                        right = mid-1;
                    }
                    else {
                        left = mid+1;
                    }
                    mid = left + (right-left)/2;
                }
                seq[p] = nums[i];
            }
        }
        return index+1;
    }

    public static void main(String[] args) {
        int[] nums1 = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums1));
        int[] nums2 = {0,1,0,3,2,3};
        System.out.println(lengthOfLIS(nums2));
        int[] nums3 = {7,7,7,7,7,7,7};
        System.out.println(lengthOfLIS(nums3));
    }
}
