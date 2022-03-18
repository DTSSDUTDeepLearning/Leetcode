package SuanFa.l1910;

public class l1910 {

    public String removeOccurrences(String s, String part) {
        int plen = part.length();
        int index = s.indexOf(part);
        while (index != -1) {
            s = s.substring(0, index) + s.substring(index+plen);
            index = s.indexOf(part);
        }
        return s;
    }
}