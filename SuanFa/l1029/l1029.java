package SuanFa.l1029;

public class l1029 {

    public int twoCitySchedCost(int[][] costs) {
        int len = costs.length;
        int[] a_b = new int[len];
        int sum = 0;
        for (int i = 0;i < len;i++) {
            a_b[i] = costs[i][0]-costs[i][1];
            sum+=costs[i][1];
        }
        quick(a_b, 0, len-1, len/2);
        for (int i = 0;i < len/2;i++) {
            sum+=a_b[i];
        }
        return sum;
    }

    // 参考剑指offer第40题
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
