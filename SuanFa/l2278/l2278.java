package l2278;

public class l2278 {

    public int percentageLetter(String s, char letter) {
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == letter) {
                cnt++;
            }
        }
        return cnt * 100 / s.length();
    }
}
