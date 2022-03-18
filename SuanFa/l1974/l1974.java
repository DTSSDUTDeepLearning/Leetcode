package SuanFa.l1974;

public class l1974 {

    public int minTimeToType(String word) {
        char pre = 'a';
        int cnt = word.length();
        for (char c : word.toCharArray()) {
            int dis = Math.abs(c - pre);
            cnt += Math.min(dis, 26 - dis);
            pre = c;
        }
        return cnt;
    }
}
