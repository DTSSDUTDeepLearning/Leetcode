package SuanFa.l905;

public class l905_1 {

    // 最好的原地方法，改编自牛客网第77题
    public int[] sortArrayByParity(int[] A) {
        int last_even = A.length;
        int cur_even = last_even-1;
        int k = 1;
        while (cur_even >= 0) {
            while (cur_even >= 0 && A[cur_even]%2==0) {
                cur_even--;
            }
            if (cur_even >= 0) {
                for (int i = cur_even;i < last_even-1;i++) {
                    int temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                }
                last_even = A.length-k;
                cur_even--;
                k++;
            }
        }
        return A;
    }
}
