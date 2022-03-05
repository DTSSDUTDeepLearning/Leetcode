package SuanFa.l986;

import java.util.LinkedList;
import java.util.List;

public class l986 {

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> l = new LinkedList<>();
        int len1 = firstList.length;
        int len2 = secondList.length;
        int i = 0;
        int j = 0;
        while (i < len1 && j < len2) {
            int a = Math.max(firstList[i][0], secondList[j][0]);
            int b = Math.min(firstList[i][1], secondList[j][1]);
            if (a <= b) {
                l.add(new int[]{a, b});
            }
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            }
            else {
                j++;
            }
        }
        return l.toArray(new int[l.size()][2]);
    }
}
