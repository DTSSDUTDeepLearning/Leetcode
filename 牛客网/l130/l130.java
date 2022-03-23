package NowCoder.l130;

public class l130 {

    public int candy (int[] arr) {
        int len = arr.length;
        int sum = 1;
        int inc = 1;
        int pre = 1;
        int dec = 0;
        for (int i = 1;i < len;i++) {
            if (arr[i] >= arr[i-1]) {
                dec = 0;
                pre = arr[i] == arr[i-1] ? 1 : pre+1;
                sum += pre;
                inc = pre;
            }
            else {
                dec++;
                if (dec == inc) {
                    dec++;
                }
                sum += dec;
                pre = 1;
            }
        }
        return sum;
    }
}
