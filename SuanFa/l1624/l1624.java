package SuanFa.l1624;

public class l1624 {

    public int maxLengthBetweenEqualCharacters(String s) {
        int max = 0;
        for (char c = 'a';c < 'z';c++) {
            int i = s.indexOf(c);
            if (i != -1) {
                max = Math.max(max, s.lastIndexOf(c)-i-1);
            }
        }
        return max;
    }
}
