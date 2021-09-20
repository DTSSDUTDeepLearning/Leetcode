package SuanFa.l658;

import java.util.LinkedList;
import java.util.List;

public class l658 {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int len = arr.length;
        List<Integer> result = new LinkedList<>();
        if (x <= arr[0]) {
            for (int i = 0;i < k;i++) {
                result.add(arr[i]);
            }
            return result;
        }
        else if (x >= arr[len-1]) {
            for (int i = 0;i < k;i++) {
                result.add(0, arr[len-1-i]);
            }
            return result;
        }
        int be_index = find_bigger_equals_index(arr, x);
        int left = be_index - 1;
        int right = be_index;
        for (int i = 0;i < k;i++) {
            if (left == -1) {
                for (int j = i;j < k;j++) {
                    result.add(arr[right++]);
                }
                return result;
            }
            else if (right == len) {
                for (int j = i;j < k;j++) {
                    result.add(0, arr[left--]);
                }
                return result;
            }
            else {
                if (x - arr[left] <= arr[right] - x) {
                    result.add(0, arr[left--]);
                }
                else {
                    result.add(arr[right++]);
                }
            }
        }
        return result;
    }

    public int find_bigger_equals_index(int[] arr, int x) {
        int left = 1;
        int right = arr.length - 1;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (arr[mid] == x) {
                return mid;
            }
            else if (arr[mid] < x) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
        }
        return left;
    }

    public static void main(String[] args) {
        l658 l = new l658();
        int[] arr1 = {1,2,3,4,5};
        int k1 = 3;
        int x11 = -1;
        int x12 = 1;
        int x13 = 2;
        int x14 = 3;
        int x15 = 4;
        int x16 = 5;
        int x17 = 6;
        int k2 = 5;
        int x21 = 3;
        int[] arr2 = {0,0,1,2,3,3,4,7,7,8};
        int k3 = 3;
        int x31 = 3;
        int x32 = 5;
        System.out.println(l.findClosestElements(arr1, k1, x11));
        System.out.println(l.findClosestElements(arr1, k1, x12));
        System.out.println(l.findClosestElements(arr1, k1, x13));
        System.out.println(l.findClosestElements(arr1, k1, x14));
        System.out.println(l.findClosestElements(arr1, k1, x15));
        System.out.println(l.findClosestElements(arr1, k1, x16));
        System.out.println(l.findClosestElements(arr1, k1, x17));
        System.out.println(l.findClosestElements(arr1, k2, x21));
        System.out.println(l.findClosestElements(arr2, k3, x31));
        System.out.println(l.findClosestElements(arr2, k3, x32));
    }
}
