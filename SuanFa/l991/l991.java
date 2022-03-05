package SuanFa.l991;

public class l991 {

    public int brokenCalc(int X, int Y) {
        int cnt = 0;
        while (Y > X) {
            if (Y % 2 == 0) {
                Y /= 2;
            }
            else {
                Y++;
            }
            cnt++;
        }
        return cnt+(X-Y);
    }
}
