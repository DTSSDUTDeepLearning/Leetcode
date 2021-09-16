package SuanFa.l459;

public class l459 {

    public boolean repeatedSubstringPattern(String s) {
        return (s+s).indexOf(s, 1) != s.length();
    }
}
