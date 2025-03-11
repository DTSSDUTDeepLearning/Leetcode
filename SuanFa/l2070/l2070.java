package l2070;

import java.util.Arrays;
import java.util.Comparator;

public class l2070 {

    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o1[0]-o2[0] : o1[1]-o2[0];
            }
        });
        int itemLength = items.length;
        for (int i = 1;i < itemLength;i++) {
            items[i][1] = Math.max(items[i][1], items[i-1][1]);
        }

        int queriesLength = queries.length;
        int[] result = new int[queriesLength];
        for (int i = 0;i < queriesLength;i++) {
            int left = 0;
            int right = itemLength;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (items[mid][0] > queries[i]) {
                    right = mid;
                }
                else {
                    left = mid + 1;
                }
            }
            result[i] = left == 0 ? 0 : items[left-1][1];
        }
        return result;
    }
}
