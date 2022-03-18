package NowCoder.l022;

public class l022 {

    public void merge(int A[], int m, int B[], int n) {
        int a = m-1;
        int b = n-1;
        int k = m+n-1;
        while (a >= 0 && b >= 0) {
            if (A[a] >= B[b]) {
                A[k--] = A[a--];
            }
            else {
                A[k--] = B[b--];
            }
        }
        while (b >= 0) {
            A[b] = B[b];
            b--;
        }
    }
}
