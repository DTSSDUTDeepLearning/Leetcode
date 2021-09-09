package SuanFa.l169;

import java.util.Arrays;

public class l169_2 {

    // 摩尔投票法
    public int majorityElement(int[] nums) {
        int candi = nums[0];
        int cnt = 1;
        int len = nums.length;
        for (int i = 1;i < len;i++) {
            if (candi == nums[i]) {
                cnt++;
            }
            else {
                if (cnt == 1) {
                    candi = nums[i];
                }
                else {
                    cnt--;
                }
            }
        }
        // 如果nums中可以没有多数元素，那么就按照下面的代码返回
//        if (cnt == 1) {
//            return 0;
//        }
//        else {
//            return candi;
//        }
        return candi;
    }

    public static void main(String[] args) {
        l169_2 l = new l169_2();
        int[] nums1 = {3,3,3,5,5};
//        int[] nums2 = {1,3,3,5,5};
        System.out.println(l.majorityElement(nums1));
//        System.out.println(l.majorityElement(nums2));
    }
}
