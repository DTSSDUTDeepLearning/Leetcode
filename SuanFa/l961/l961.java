package SuanFa.l961;

public class l961 {

    public int repeatedNTimes(int[] A) {
        int len = A.length;
        for (int i = 1;i <= 3;i++) {
            for (int j = 0;j < len-i;j++) {
                if (A[j] == A[j+i]) {
                    return A[j];
                }
            }
        }
        return -1;
    }
}
