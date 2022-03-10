package SuanFa.l1337;

import java.util.*;

public class l1337 {

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] > o2[1]) {
                    return -1;
                }
                else if (o1[1] < o2[1]) {
                    return 1;
                }
                else if (o1[0] > o2[0]){
                    return -1;
                }
                else {
                    return 1;
                }
            }
        });
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0;i < k;i++) {
            int j = 0;
            while (j < col && mat[i][j] == 1) {
                j++;
            }
            pq.offer(new int[]{i, j});
        }
        for (int i = k;i < row;i++) {
            int j = 0;
            while (j < col && mat[i][j] == 1) {
                j++;
            }
            int[] tmp = pq.peek();
            if (tmp[1] > j) {
                pq.poll();
                pq.offer(new int[]{i, j});
            }
        }
        int[] result = new int[k];
        for (int i = 0;i < k;i++) {
            result[k-i-1] = pq.poll()[0];
        }
        return result;
    }
}
