package JianZhiOffer.l040;

public class l040 {

    public int[] getLeastNumbers(int[] arr, int k) {
        quick(arr, 0, arr.length-1, k);
        int[] result = new int[k];
        for (int i = 0;i < k;i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public void quick(int[] arr, int left, int right, int k) {
        if (left >= right) {
            return;
        }
        int mid = quicksort(arr, left, right);
        if (mid-left+1 == k || mid-left == k) {
            return;
        }
        else if (mid-left > k) {
            quick(arr, left, mid-1, k);
        }
        else {
            quick(arr, mid+1, right, k-(mid-left+1));
        }
    }

    public int quicksort(int[] arr, int left, int right) {
        int pivot = arr[left];
        int pivot_id = left++;
        while (left <= right) {
            while (left <= right && arr[left] <= pivot) {
                left++;
            }
            while (left <= right && arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        arr[pivot_id] = arr[right];
        arr[right] = pivot;
        return right;
    }
}
