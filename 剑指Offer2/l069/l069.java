package JianZhiOffer2.l069;

public class l069 {

    public int peakIndexInMountainArray(int[] arr) {
        int left = 1;
        int right = arr.length - 2;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (arr[mid-1] < arr[mid]) {
                if (arr[mid] > arr[mid+1]) {
                    return mid;
                }
                else {
                    left = mid + 1;
                }
            }
            else {
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
        }
        return left;
    }
}
