package SuanFa.l135;

public class l135_1 {

    // 空间复杂度为O(n)
    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] left = new int[len];
        left[0] = 1;
        for (int i = 1;i < len;i++) {
            if (ratings[i] > ratings[i-1]) {
                left[i] = left[i-1] + 1;
            }
            else {
                left[i] = 1;
            }
        }
        int right = 1;
        int sum = left[len-1];
        for (int i = len-2;i >= 0;i--) {
            if (ratings[i] > ratings[i+1]) {
                right++;
            }
            else {
                right = 1;
            }
            sum += Math.max(left[i], right);
        }
        return sum;
    }
}
