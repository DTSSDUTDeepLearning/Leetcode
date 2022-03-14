package SuanFa.l1630;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class l1630 {

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int len = l.length;
        List<Boolean> result = new LinkedList<>();
        for (int i = 0;i < len;i++) {
            int[] tmp = new int[r[i]-l[i]+1];
            for (int j = l[i];j <= r[i];j++) {
                tmp[j-l[i]] = nums[j];
            }
            result.add(canMakeArithmeticProgression(tmp));
        }
        return result;
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int sub = arr[1] - arr[0];
        int len = arr.length;
        for (int i = 2;i < len;i++) {
            if (sub != arr[i] - arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}
