package LCS.l001;

public class l001 {

    public int leastMinutes(int n) {
        return (int)Math.ceil(Math.log(n)/Math.log(2)) + 1;
    }
}
