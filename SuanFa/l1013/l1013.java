package SuanFa.l1013;

public class l1013 {

    public boolean canThreePartsEqualSum(int[] arr) {
        int total_sum = 0;
        for (int a : arr) {
            total_sum+=a;
        }
        if (total_sum % 3 != 0) {
            return false;
        }
        int sum_part = total_sum / 3;
        int len = arr.length;
        int i = 0;
        int sum_1 = arr[i++];
        while (i < len-2 && sum_1 != sum_part) {
            sum_1+=arr[i++];
        }
        if (i == len-2) {
            if (arr[len-2] == arr[len-1] && arr[len-2] == sum_part) {
                return true;
            }
            else {
                return false;
            }
        }
        sum_1 = arr[i++];
        while (i < len-1 && sum_1 != sum_part) {
            sum_1+=arr[i++];
        }
        if (i == len-1) {
            return false;
        }
        else {
            return true;
        }
    }
}
