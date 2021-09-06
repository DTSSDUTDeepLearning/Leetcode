package SuanFa.l015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l015 {

    public static void printListList(List<List<Integer>> ll) {
        for (List<Integer> l : ll) {
            for (Integer number : l) {
                System.out.print(number);
                System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0;i < nums.length-2;i++) {
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = -nums[i];
            int k = nums.length-1;
            for (int j = i+1;j < nums.length-1;j++) {
                if (j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                while (nums[j] + nums[k] > target && j < k) {
                    k--;
                }
                if (j == k) {
                    break;
                }
                if (nums[j] + nums[k] == target) {
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(nums[k]);
                    result.add(tmp);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1,0,1,2,-1,-4};
        printListList(threeSum(nums1));
    }
}
