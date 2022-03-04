package SuanFa.l905;

public class l905_3 {

    // 快速排序的方法，时间100%
    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length-1;
        while (left < right) {
            if (A[left] % 2 > A[right] % 2) {
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
            }
            if (A[left] % 2 == 0) {
                left++;
            }
            if (A[right] % 2 == 1) {
                right--;
            }
        }
        return A;
    }
}
