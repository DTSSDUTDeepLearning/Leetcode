package l904;

import java.util.HashSet;
import java.util.Set;

public class l904 {

    public int totalFruit(int[] fruits) {
        Set<Integer> set = new HashSet<>();
        set.add(fruits[0]);
        int result = 1;
        int left = 0;
        while (left < fruits.length-1) {
            int pivot = fruits[left];
            int right = left+1;
            int cnt = 1;
            while (right < fruits.length) {
                if (set.contains(fruits[right])) {
                    cnt++;
                    right++;
                }
                else if (set.size() == 1) {
                    cnt++;
                    set.add(fruits[right]);
                    left = right++;
                }
                else {
                    break;
                }
            }
            result = Math.max(result, cnt);
            set.remove(pivot);
            if (right == fruits.length) {
                break;
            }
        }
        return result;
    }
}
