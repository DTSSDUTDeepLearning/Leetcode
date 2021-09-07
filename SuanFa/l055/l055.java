package SuanFa.l055;

public class l055 {

    public static boolean canJump(int[] nums) {
        int len = nums.length;
        int farest = 0;
        int index = 0;
        while (true) {
            if (farest >= len-1) {
                return true;
            }

            if (nums[index] == 0) {
                if (index == farest) {
                    return false;
                }
                else {
                    boolean flag = true;
                    for (int i = index + 1; i <= farest; i++) {
                        if (nums[i] != 0) {
                            index = i;
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        return false;
                    }
                }

            }
            farest = Math.max(farest, index+nums[index]);
            index++;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {2,3,1,1,4};
        int[] nums2 = {3,2,1,0,4};
        int[] nums3 = {3,0,8,2,0,0,1};
        int[] nums4 = {1,1,2,2,0,1,1};
        System.out.println(canJump(nums1));
        System.out.println(canJump(nums2));
        System.out.println(canJump(nums3));
        System.out.println(canJump(nums4));
    }
}
