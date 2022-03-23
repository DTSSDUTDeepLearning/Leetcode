package NowCoder.l128;

public class l128 {

    public long maxWater (int[] arr) {
        long sum = 0;
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int min = Math.min(arr[left], arr[right]);
            while(left < right && arr[left] <= min){
                sum += min - arr[left];
                left ++;
            }
            while(left < right && arr[right] <= min){
                sum += min - arr[right];
                right --;
            }
        }
        return sum;
    }
}
