package MianShiTi.t10.l001;

public class l001 {

    public void merge(int[] A, int m, int[] B, int n) {
        int index = m-- + n-- - 1;
        while (m >= 0 && n >= 0) {
            if (A[m] > B[n]) {
                A[index--] = A[m--];
            }
            else {
                A[index--] = B[n--];
            }
        }
        if (m == -1) {
            System.arraycopy(B, 0, A, 0, n + 1);
        }
    }
}
