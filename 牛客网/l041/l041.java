package NowCoder.l041;

import java.util.HashSet;
import java.util.Set;

public class l041 {

    public int maxLength (int[] arr) {
        int len = arr.length;
        Set<Integer> s = new HashSet<>();
        s.add(arr[0]);
        int max = 1;
        int left = 0;
        for (int right = 1;right < len;right++) {
            if (s.contains(arr[right])) {
                int left_tmp = right-1;
                while (left_tmp >= 0 && arr[left_tmp] != arr[right]) {
                    left_tmp--;
                }
                for (int i = left;i < left_tmp;i++) {
                    s.remove(arr[i]);
                }
                left = left_tmp+1;
            }
            else {
                s.add(arr[right]);
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}
