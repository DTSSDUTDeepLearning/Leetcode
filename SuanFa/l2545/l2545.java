package l2545;

import java.util.Arrays;

public class l2545 {

    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (u, v) -> v[k] - u[k]);
        return score;
    }
}
