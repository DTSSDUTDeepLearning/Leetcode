package SuanFa.l1253;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class l1253 {

    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int len = colsum.length;
        int[][] results = new int[2][len];
        List<List<Integer>> result_list = new LinkedList<>();
        boolean flag = true;
        for (int i = 0;i < len;i++) {
            if (upper == 0) {
                int colSum = 0;
                for (int j = i;j < len;j++) {
                    if (colsum[j] == 2) {
                        return result_list;
                    }
                    colSum+=colsum[j];
                }
                if (lower == colSum) {
                    for (int j = i;j < len;j++) {
                        if (colsum[j] == 2) {
                            return result_list;
                        }
                        results[1][j] = colsum[j];
                    }
                    flag = false;
                    break;
                }
                else {
                    return result_list;
                }
            }
            else if (lower == 0) {
                int colSum = 0;
                for (int j = i;j < len;j++) {
                    colSum+=colsum[j];
                }
                if (upper == colSum) {
                    for (int j = i;j < len;j++) {
                        results[0][j] = colsum[j];
                    }
                    flag = false;
                    break;
                }
                else {
                    return result_list;
                }
            }
            else if (colsum[i] == 2) {
                results[0][i] = 1;
                results[1][i] = 1;
                upper--;
                lower--;
            }
            else if (colsum[i] == 1) {
                if (upper >= lower) {
                    results[0][i] = 1;
                    results[1][i] = 0;
                    upper--;
                }
                else {
                    results[0][i] = 0;
                    results[1][i] = 1;
                    lower--;
                }
            }
        }
        if (flag && (upper != 0 || lower != 0)) {
            return result_list;
        }
        List<Integer> u = new LinkedList<>();
        for (int num : results[0]) {
            u.add(num);
        }
        result_list.add(u);
        List<Integer> l = new LinkedList<>();
        for (int num : results[1]) {
            l.add(num);
        }
        result_list.add(l);
        return result_list;
    }
}
