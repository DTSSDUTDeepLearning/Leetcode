package JianZhiOffer.l065;

public class l065 {

    public int add(int a, int b) {
        while (a != 0) {
            int temp = (a ^ b);
            a = ((a & b) << 1);
            b = temp;
        }
        return b;
    }
}
