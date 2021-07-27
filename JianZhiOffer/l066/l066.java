package JianZhiOffer.l066;

public class l066 {

    public int[] constructArr(int[] a) {
        int len = a.length;
        int[] lefts = new int[len];
        int left = 1;
        int right = 1;
        for (int i = 0;i < len;i++) {
            lefts[i] = left;
            left*=a[i];
        }
        for (int i = len-1;i >= 0;i--) {
            lefts[i]*=right;
            right*=a[i];
        }
        return lefts;
    }
}
