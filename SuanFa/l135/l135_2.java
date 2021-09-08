package SuanFa.l135;

public class l135_2 {

    // 空间复杂度为O(1)
    public int candy(int[] ratings) {
        int len = ratings.length;
        int sum = 1;
        int inc = 1;
        int pre = 1;
        int dec = 0;
        for (int i = 1;i < len;i++) {
            if (ratings[i] >= ratings[i-1]) {
                dec = 0;
                pre = ratings[i] == ratings[i-1] ? 1 : pre+1;
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
