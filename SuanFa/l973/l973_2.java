package SuanFa.l973;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class l973_2 {

    // 使用快排思想，适时停止
    public int[][] kClosest(int[][] points, int k) {
        if (points.length == k) {
            return points;
        }
        quick(points, 0, points.length-1, k);
        return Arrays.copyOfRange(points, 0, k);
    }

    public void quick(int[][] points, int left, int right, int k) {
        int[] pivot = points[left];
        int i = left+1;
        int j = right;
        while (i <= j) {
            while (i <= j && compare(points[i], pivot)) {
                i++;
            }
            while (i <= j && compare(pivot, points[j])) {
                j--;
            }
            if (i < j) {
                int[] tmp = points[i];
                points[i] = points[j];
                points[j] = tmp;
            }
        }
        int[] tmp = points[left];
        points[left] = points[j];
        points[j] = tmp;
        if (j-left > k) {
            quick(points, left, j-1, k);
        }
        else if (j-left < k){
            quick(points, j+1, right, k-(j-left+1));
        }
    }

    public boolean compare(int[] p1, int[] p2) {
        return p1[0]*p1[0]+p1[1]*p1[1]-p2[0]*p2[0]-p2[1]*p2[1]<=0;
    }
}
