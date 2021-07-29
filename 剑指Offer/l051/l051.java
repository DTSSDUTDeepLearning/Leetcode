package JianZhiOffer.l051;

public class l051 {

    public int reversePairs(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return 0;
        }
        int[] tmp = new int[len];
        return partition(nums, 0, len-1, tmp);
    }

    public int partition(int[] array, int left, int right, int[] tmp) {
        if (left >= right) {
            return 0;
        }
        int mid = left+(right-left)/2;
        int left_cnt = partition(array, left, mid, tmp);
        int right_cnt = partition(array, mid+1, right, tmp);
        if (array[mid] <= array[mid+1]) {
            return left_cnt+right_cnt;
        }
        return merge(array, left, mid, right, tmp)+left_cnt+right_cnt;
    }

    public int merge(int[] array, int left, int mid, int right, int[] tmp) {
        for (int i = left;i <= right;i++) {
            tmp[i] = array[i];
        }
        int i = left;
        int j = mid+1;
        int cnt = 0;
        for (int k = left; k <= right; k++) {
            if (i == mid + 1) {
                array[k] = tmp[j];
                j++;
            } else if (j == right + 1) {
                array[k] = tmp[i];
                i++;
            } else if (tmp[i] <= tmp[j]) {
                array[k] = tmp[i];
                i++;
            } else {
                array[k] = tmp[j];
                j++;
                cnt += (mid - i + 1);
            }
        }
        return cnt;
    }
}
