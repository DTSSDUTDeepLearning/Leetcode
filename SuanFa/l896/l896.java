package SuanFa.l896;

public class l896 {

    public boolean isMonotonic(int[] A) {
        int len = A.length;
        if (len <= 2) {
            return true;
        }
        int start = 0;
        while (start < len-1 && A[start] == A[start+1]) {
            start++;
        }
        if (start == len-1) {
            return true;
        }
        if (A[start] < A[start+1]) {
            for (int i = start;i < len-1;i++) {
                if (A[i] > A[i+1]) {
                    return false;
                }
            }
        }
        else {
            for (int i = start;i < len-1;i++) {
                if (A[i] < A[i+1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
