package SuanFa.l1385;

import org.omg.CORBA.MARSHAL;

import java.util.Arrays;

public class l1385 {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int len = arr2.length;
        int cnt = 0;
        for (int num : arr1) {
            int index = small(num, arr2);
            if (index == len) {
                if (Math.abs(num-arr2[len-1]) > d) {
                    cnt++;
                }
            }
            else if (index == 0) {
                if (Math.abs(num-arr2[0]) > d) {
                    cnt++;
                }
            }
            else {
                if (Math.abs(num-arr2[index-1]) > d && Math.abs(num-arr2[index]) > d) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public int small(int n, int[] arr) {
        int right = arr.length-1;
        if (arr[right] < n) {
            return right+1;
        }
        int left = 0;
        int mid = left+(right-left)/2;
        while (left <= right) {
            if (arr[mid] < n) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
            mid = left+(right-left)/2;
        }
        return left;
    }
}
