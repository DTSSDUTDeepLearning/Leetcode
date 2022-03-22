package NowCoder.l071;

public class l071 {

    public int minNumberInRotateArray(int [] array) {
        int len = array.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1 || array[0] < array[len-1]) {
            return array[0];
        }
        if (array[len-2] > array[len-1]) {
            return array[len-1];
        }
        int left = 0;
        int right = len;
        int mid = left+(right-left)/2;
        while (left < right) {
            if (array[mid] > array[mid+1]) {
                return array[mid+1];
            }
            if (array[mid] > array[left]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
            mid = left+(right-left)/2;
        }
        return array[left];
    }
}
