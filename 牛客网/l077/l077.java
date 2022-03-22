package NowCoder.l077;

import java.util.Arrays;

public class l077 {

    public static int[] reOrderArray (int[] array) {
        int last_even = array.length;
        int cur_even = last_even-1;
        int k = 1;
        while (cur_even >= 0) {
            while (cur_even >= 0 && array[cur_even]%2!=0) {
                cur_even--;
            }
            if (cur_even >= 0) {
                System.out.printf("从后往前，第%d个被找到的偶数的索引为%d，数字为%d\n", k, cur_even, array[cur_even]);
                for (int i = cur_even;i < last_even-1;i++) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
                System.out.println("将偶数后移后，数组变为了");
                System.out.println(Arrays.toString(array));
                last_even = array.length-k;
                cur_even--;
                k++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reOrderArray(array)));
    }
}
