package SuanFa.l136;

public class l136 {

    public static int singleNumber(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            ret ^= num;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,2,1};
        int[] nums2 = {4,1,2,1,2};
        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber(nums2));
    }
}
