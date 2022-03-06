package SuanFa.l1009;

public class l1009 {

    public int bitwiseComplement(int N) {
        if (N == 0) {
            return 1;
        }
        int len = (int)(Math.log(N) / Math.log(2))+1;
        return (int)Math.pow(2, len)-1-N;
    }
}
