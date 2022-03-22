package NowCoder.l074;

public class l074 {

    public int GetNumberOfK(int [] array , int k) {
        int len = array.length;
        if (len == 0 || k > array[len-1] || k < array[0]) {
            return 0;
        }
        int left = 0;
        int right = len;
        int mid = left+(right-left)/2;
        while (left < right) {
            if (array[mid] < k) {
                left = mid+1;
            }
            else {
                right = mid;
            }
            mid = left+(right-left)/2;
        }
        int first = left;
        left = 0;
        right = len;
        while (left < right) {
            if (array[mid] <= k) {
                left = mid+1;
            }
            else {
                right = mid;
            }
            mid = left+(right-left)/2;
        }
        return left-first;
    }
}
