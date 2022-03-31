package NowCoder.l153;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class l153 {

    public int maxLetters (int[][] letters) {
        int len = letters.length;
        Arrays.sort(letters, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                } else {
                    return o2[1] - o1[1];
                }
            }
        });
        List<Integer> l = new LinkedList<>();
        l.add(letters[0][1]);
        for (int i = 1; i < len; ++i) {
            int num = letters[i][1];
            if (num > l.get(l.size() - 1)) {
                l.add(num);
            }
            else {
                int index = binarySearch(l, num);
                l.set(index, num);
            }
        }
        return l.size();
    }

    public int binarySearch(List<Integer> l, int target) {
        int left = 0;
        int right = l.size() - 1;
        int mid = (right - left) / 2 + left;
        while (left <= right) {
            if (l.get(mid) < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
            mid = (right - left) / 2 + left;
        }
        return left;
    }
}
