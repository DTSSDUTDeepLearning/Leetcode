package SuanFa.l1299;

public class l1299 {

    public int[] replaceElements(int[] arr) {
        int right = arr.length-1;
        int max = arr[right];
        arr[right] = -1;
        for (int i = right-1;i >= 0;i--) {
            int tmp = arr[i];
            arr[i] = max;
            max = Math.max(max, tmp);
        }
        return arr;
    }
}
