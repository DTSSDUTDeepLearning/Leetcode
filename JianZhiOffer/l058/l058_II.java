package JianZhiOffer.l058;

public class l058_II {

    public String reverseLeftWords(String s, int n) {
        return s.substring(n).concat(s.substring(0, n));
    }
}
