package SuanFa.l826;

import java.util.Arrays;
import java.util.Comparator;

public class l826 {

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int m = difficulty.length;
        int n = worker.length;
        int[][] diff_pro = new int[m+1][2];
        for (int i = 0;i < m;i++) {
            diff_pro[i][0] = difficulty[i];
            diff_pro[i][1] = profit[i];
        }
        diff_pro[m][0] = 0;
        diff_pro[m][1] = 0;
        Arrays.sort(diff_pro, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        Arrays.sort(worker);
        if (worker[n-1] < diff_pro[1][0]) {
            return 0;
        }
        int i = 1;
        int j = 0;
        int max_pro = 0;
        int sum = 0;
        while (i <= m && j < n) {
            if (diff_pro[i][0] <= worker[j]) {
                max_pro = Math.max(max_pro, diff_pro[i][1]);
                i++;
            }
            else if (diff_pro[i-1][0] > worker[j]){
                j++;
            }
            else {
                sum += max_pro;
                j++;
            }
        }
        for (;j < n;j++) {
            sum += max_pro;
        }
        return sum;
    }
}
