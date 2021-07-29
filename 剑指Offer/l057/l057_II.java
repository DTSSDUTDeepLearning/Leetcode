package JianZhiOffer.l057;

import java.util.LinkedList;
import java.util.List;

public class l057_II {

    public int[][] findContinuousSequence(int target) {
        List<int[]> l = new LinkedList<>();
        int left = 1;
        int right = 2;
        while (left < right) {
            int sum = (left+right)*(right-left+1)/2;
            if (sum == target) {
                int[] result = new int[right-left+1];
                for (int i = left;i <= right;i++) {
                    result[i] = i;
                }
                l.add(result);
                left++;
            }
            else if (sum < target) {
                right++;
            }
            else {
                left++;
            }
        }
        return l.toArray(new int[l.size()][]);
    }
}
