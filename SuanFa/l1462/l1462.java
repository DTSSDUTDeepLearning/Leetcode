package SuanFa.l1462;

import java.util.LinkedList;
import java.util.List;

public class l1462 {

    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        boolean[][] matrix = new boolean[numCourses][numCourses];
        for (int[] pre : prerequisites) {
            int p = pre[0];
            int q = pre[1];
            matrix[p][q] = true;
            for (int i = 0;i < numCourses;i++) {
                if (matrix[q][i]) {
                    matrix[p][i] = true;
                }
                if (matrix[i][p]) {
                    matrix[i][q] = true;
                }
            }
        }
        List<Boolean> result = new LinkedList<>();
        for (int[] query : queries) {
            result.add(matrix[query[0]][query[1]]);
        }
        return result;
    }
}
