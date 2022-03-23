package NowCoder.l106;

public class l106 {

    public long solve (int[] A) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int a : A) {
            if (a > max1) {
                max3 = max2;
                max2 = max1;
                max1 = a;
            }
            else if (a > max2) {
                max3 = max2;
                max2 = a;
            }
            else if (a > max3) {
                max3 = a;
            }
            if (a < min1) {
                min2 = min1;
                min1 = a;
            }
            else if (a < min2) {
                min2 = a;
            }
        }
        return Math.max((long)max1*(long)max2*(long)max3, (long)max1*(long)min1*(long)min2);
    }
}
