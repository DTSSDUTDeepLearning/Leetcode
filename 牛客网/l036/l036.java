package NowCoder.l036;

import java.util.Map;

public class l036 {

    public int findMedianinTwoSortedAray (int[] arr1, int[] arr2) {
        if(arr1.length == 1) {
            return Math.min(arr1[0],arr2[0]);
        }
        int left1 = 0;
        int left2 = 0;
        int right1 = arr1.length-1;
        int right2 = arr2.length-1;
        while (left1 < right1 && left2 < right2) {
            int mid1 = left1 + (right1-left1)/2;
            int mid2 = left2 + (right2-left2)/2;
            int flag = ((right1 - left1 + 1) & 1); // 判断当前元素个数，因为上中位数和剩余元素是奇数个还是偶数个有关
            if (arr1[mid1] == arr2[mid2]) {
                return arr1[mid1];
            }
            else if (arr1[mid1] < arr2[mid2]) {
                if (flag == 1) {
                    left1 = mid1;
                    right2 = mid2;
                }
                else {
                    left1 = mid1 + 1;
                    right2 = mid2;
                }
            }
            else {
                if (flag == 1) {
                    right1 = mid1;
                    left2 = mid2;
                }
                else {
                    right1 = mid1;
                    left2 = mid2+1;
                }

            }
        }
        return Math.min(arr1[left1], arr2[left2]);
    }
}
