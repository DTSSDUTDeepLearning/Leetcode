package NowCoder.l088;

public class l088 {

    public int findKth(int[] a, int n, int K) {
        int left = 0;
        int right = n-1;
        K--;
        while (left < right) {
            int p = quick_sort(a, left, right);
            if (p == K) {
                return a[p];
            }
            else if (p < K) {
                left = p+1;
            }
            else {
                right = p-1;
            }
        }
        return a[left];
    }

    public static int quick_sort(int[] arrays, int left, int right) {
        int p = left;
        int pivot = arrays[left++];
        while (left <= right) {
            while (left <= right && arrays[left] >= pivot) {
                left++;
            }
            while (left <= right && arrays[right] < pivot) {
                right--;
            }
            if (left <= right) {
                int tmp = arrays[left];
                arrays[left] = arrays[right];
                arrays[right] = tmp;
            }
        }
        arrays[p] = arrays[right];
        arrays[right] = pivot;
        return right;
    }
}
