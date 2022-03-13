package SuanFa.l1588;

public class l1588 {

    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int len = arr.length;
        for (int i = 0;i < len;i++) {
            int left = i+1; // 可以补0个数，所以left为i+1
            int right = len-i; // 同上
            int left_odd = left/2;
            int left_even = (left+1)/2;
            int right_odd = right/2;
            int right_even = (right+1)/2;
            sum += (left_odd*right_odd + left_even*right_even)*arr[i];
        }
        return sum;
    }
}
