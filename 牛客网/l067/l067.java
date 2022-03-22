package NowCoder.l067;

import java.util.ArrayList;

public class l067 {

    ArrayList<String> result;

    public ArrayList<String> getSolution(int n) {
        result = new ArrayList<>();
        Hanuota(n, "left", "mid", "right");
        return result;
    }

    public void Hanuota(int n, String A, String B, String C) {
        if (n == 0) {
            return;
        }
        Hanuota(n-1, A, C, B);
        result.add("move from "+ A +" to "+ C);
        Hanuota(n-1, B, A, C);
    }
}
