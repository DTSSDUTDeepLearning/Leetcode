package SuanFa.l476;

public class l476 {

    public int findComplement(int num) {
        int high = 0;
        int tmp = num;
        while (tmp > 0) {
            high++;
            tmp >>= 1;
        }
        return num ^ ((1 << high) - 1);
    }
}
