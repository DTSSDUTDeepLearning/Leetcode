package NowCoder.l083;

public class l083 {

    public double maxProduct(double[] arr) {
        int len = arr.length;
        double max = arr[0];
        double min = arr[0];
        double result = arr[0];
        for (int i = 1; i < len; ++i) {
            double t1 = max;
            double t2 = min;
            max = Math.max(t1 * arr[i], Math.max(arr[i], t2 * arr[i]));
            min = Math.min(t2 * arr[i], Math.min(arr[i], t1 * arr[i]));
            result = Math.max(max, result);
        }
        return result;
    }
}
