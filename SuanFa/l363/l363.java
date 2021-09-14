package SuanFa.l363;

import java.util.TreeSet;

public class l363 {

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int result = Integer.MIN_VALUE;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0;i < row;i++) {
            int[] sum = new int[col];
            for (int j = i;j < row;j++) {
                for (int l = 0;l < col;l++) {
                    sum[l]+=matrix[j][l];
                }
                TreeSet<Integer> tree = new TreeSet<>();
                tree.add(0);
                int s = 0;
                for (int v : sum) {
                    s+=v;
                    Integer t = tree.ceiling(s-k);
                    if (t != null) {
                        result = Math.max(result, s-t);
                    }
                    tree.add(s);
                }
            }
        }
        return result;
    }
}
