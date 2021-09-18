package SuanFa.l551;

public class l551 {

    public boolean checkRecord(String s) {
        if (s.indexOf("LLL") != -1) {
            return false;
        }
        int indexA = s.indexOf('A');
        if (indexA == -1) {
            return true;
        }
        s = s.substring(indexA+1);
        if (s.indexOf('A') != -1) {
            return false;
        }
        else {
            return true;
        }
    }
}
