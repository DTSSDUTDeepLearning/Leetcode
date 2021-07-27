package JianZhiOffer.l017;

public class l017 {

    public int[] printNumbers(int n) {
        int max = (int)Math.pow(10, n);
        int[] l = new int[max-1];
        for (int i = 1;i < max;i++) {
            l[i-1] = i;
        }
        return l;
    }
}
