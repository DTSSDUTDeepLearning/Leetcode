package SuanFa.l941;

public class l941 {

    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if (len < 3) {
            return false;
        }
        int i = 0;
        while (i < len-1 && arr[i]<arr[i+1]) {
            i++;
        }
        if (i == 0 || i == len-1) {
            return false;
        }
        while (i < len-1 && arr[i]>arr[i+1]) {
            i++;
        }
        return i == len - 1;
    }
}
