package l2027;

public class l2027 {

    public int minimumMoves(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        int index = 0;
        int cnt = 0;
        while (index < len) {
            if (cs[index] == 'O') {
                index++;
            }
            else {
                index+=3;
                cnt++;
            }
        }
        return cnt;
    }
}