package SuanFa.l1796;

public class l1796 {

    public int secondHighest(String s) {
        char first = (char)47;
        char second = (char)47;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                if (c >= first) {
                    if (first != (char)47 && c != first) {
                        second = first;
                    }
                    first = c;
                }
                else if (c > second) {
                    second = c;
                }
            }
        }
        return second == (char)47?-1:second-48;
    }
}
