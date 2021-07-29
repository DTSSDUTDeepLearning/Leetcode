package SuanFa.l016;

import java.util.Arrays;

public class l016 {

    public static int threeSumClosest(int[] nums, int target) {
        int sub = Integer.MAX_VALUE;
        int sum = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for (int i = 0;i < nums.length-2;i++) {
            if (sub == 0) {
                return 0;
            }
            int j = i+1;
            int k = nums.length-1;
            if (Math.abs(nums[i] + nums[j] + nums[k] - target) < sub) {
                sub = Math.abs(nums[i] + nums[j] + nums[k] - target);
                sum = nums[i] + nums[j] + nums[k];
            }
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == target) {
                    return target;
                } else if (nums[i] + nums[j] + nums[k] < target) {
                    if (Math.abs(nums[i] + nums[j] + nums[k] - target) < sub) {
                        sub = Math.abs(nums[i] + nums[j] + nums[k] - target);
                        sum = nums[i] + nums[j] + nums[k];
                    }
                    j++;
                } else {
                    if (Math.abs(nums[i] + nums[j] + nums[k] - target) < sub) {
                        sub = Math.abs(nums[i] + nums[j] + nums[k] - target);
                        sum = nums[i] + nums[j] + nums[k];
                    }
                    k--;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1,2,1,-4};
        int target1 = 1;
        int target2 = 2;
        int target3 = 4;
        int[] nums2 = {0,1,2};
        int target4 = 0;
        int target5 = -5;
        int[] nums3 = {1,1,1};
        int target6 = 4;
        int[] nums4 = {1,2,4,8,16,32,64,128};
        int target7 = 82;
        System.out.println(threeSumClosest(nums1, target1));
        System.out.println(threeSumClosest(nums1, target2));
        System.out.println(threeSumClosest(nums1, target3));
        System.out.println(threeSumClosest(nums2, target4));
        System.out.println(threeSumClosest(nums2, target5));
        System.out.println(threeSumClosest(nums3, target6));
        System.out.println(threeSumClosest(nums4, target7));
    }
}
