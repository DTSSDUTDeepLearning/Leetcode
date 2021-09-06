package SuanFa.l018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l018 {

    public static void printListList(List<List<Integer>> ll) {
        for (List<Integer> l : ll) {
            for (Integer number : l) {
                System.out.print(number);
                System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0;i < nums.length-3;i++) {
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for (int j = i+1;j < nums.length-2;j++) {
                if (j > i+1 && nums[j] == nums[j-1]) {
                    continue;
                }
                int t = target-nums[i]-nums[j];
                int l = nums.length-1;
                for (int k = j+1;k < l;k++) {
                    if (k > j+1 && nums[k] == nums[k-1]) {
                        continue;
                    }
                    while (nums[k] + nums[l] > t && k < l) {
                        l--;
                    }
                    if (k == l) {
                        break;
                    }
                    if (nums[k] + nums[l] == t) {
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        tmp.add(nums[l]);
                        result.add(tmp);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,0,-1,0,-2,2};
        int target1 = 0;
        printListList(fourSum(nums1, target1));
    }

}
