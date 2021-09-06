package SuanFa.l033;

public class l033_1 {

    // 普通的迭代法，跑起来挺快，甚至比二分法还快
    public static int search(int[] nums, int target) {
        if (nums[0] == target) {
            return 0;
        }
        if (nums[0] < target) {
            for (int i = 1;i < nums.length;i++) {
                if (nums[i] == target) {
                    return i;
                }
                if (nums[i-1] > nums[i] || nums[i] > target) {
                    return -1;
                }
            }
            return -1;
        }
        else {
            for (int i = nums.length-1;i >= 1;i--) {
                if (nums[i] == target) {
                    return i;
                }
                if (nums[i-1] > nums[i] || nums[i] < target) {
                    return -1;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0;
        int[] nums2 = nums1;
        int target2 = 3;
        int[] nums3 = {1};
        int target3 = 0;
        System.out.println(search(nums1, target1));
        System.out.println(search(nums2, target2));
        System.out.println(search(nums3, target3));
    }
}
