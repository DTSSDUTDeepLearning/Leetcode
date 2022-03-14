package SuanFa.l1732;

public class l1732 {

    public int largestAltitude(int[] gain) {
        int max = 0;
        int high = 0;
        for (int sub : gain) {
            high+=sub;
            max = Math.max(max, high);
        }
        return max;
    }
}
