package MianShiTi.t05.l006;

public class l006 {

    public int convertInteger(int A, int B) {
        A ^= B;
        int cnt = 0;
        while (A != 0) {
            A = A & (A - 1);
            cnt++;
        }
        return cnt;
    }
}
