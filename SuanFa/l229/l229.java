package SuanFa.l229;

import java.util.ArrayList;
import java.util.List;

public class l229 {

    public static List<Integer> majorityElement(int[] nums) {
        int candi1 = nums[0];
        int cnt1 = 0;
        int candi2 = nums[0];
        int cnt2 = 0;
        for (int num : nums) {
            if (candi1 == num) {
                cnt1++;
            }
            else if (candi2 == num) {
                cnt2++;
            }
            else if (cnt1 == 0) {
                candi1 = num;
                cnt1++;
            }
            else if (cnt2 == 0) {
                candi2 = num;
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for (int num : nums) {
            if (candi1 == num) {
                cnt1++;
            }
            else if (candi2 == num) {
                cnt2++;
            }
        }
        List<Integer> result = new ArrayList<>();
        if (cnt1 > nums.length/3) {
            result.add(candi1);
        }
        if (cnt2 > nums.length/3) {
            result.add(candi2);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,1,1,3,1,4,5,6};
        System.out.println(majorityElement(nums1));
    }
}
