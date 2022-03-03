package SuanFa.l852;

public class l852 {

    public int peakIndexInMountainArray(int[] arr) {
        int len = arr.length;
        int left = 1;
        int right = len-2;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (arr[mid] > arr[mid-1]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
        }
        return left;
    }
}
