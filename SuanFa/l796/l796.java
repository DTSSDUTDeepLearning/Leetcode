package SuanFa.l796;

public class l796 {

    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A+A).contains(B);
    }
}
