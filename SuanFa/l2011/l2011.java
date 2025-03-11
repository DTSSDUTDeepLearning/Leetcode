package l2011;

public class l2011 {

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s : operations) {
            if (s.charAt(1) == '+') {
                x++;
            }
            else {
                x--;
            }
        }
        return x;
    }
}