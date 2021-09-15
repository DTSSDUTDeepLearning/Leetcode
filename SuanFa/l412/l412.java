package SuanFa.l412;

import java.util.ArrayList;
import java.util.List;

public class l412 {

    public List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<>();
        for (int i = 1;i <= n;i++) {
            String s = "";
            if (i % 3 == 0) {
                s = "Fizz";
            }
            if (i % 5 == 0) {
                s += "Buzz";
            }
            if (s.equals("")) {
                s = Integer.toString(i);
            }
            results.add(s);
        }
        return results;
    }
}
