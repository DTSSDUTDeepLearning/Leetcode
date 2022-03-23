package NowCoder.l114;

public class l114 {

    public boolean solve (String A, String B) {
        return A.length()!=B.length()?false:(A+A).indexOf(B)!=-1;
    }
}
