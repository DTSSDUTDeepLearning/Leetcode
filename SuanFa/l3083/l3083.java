package l3083;

public class l3083 {

    public boolean isSubstringPresent(String s) {
        boolean[][] map = new boolean[26][26];
        char[] cs = s.toCharArray();
        for (int i = 0;i < cs.length-1;i++) {
            map[cs[i]-'a'][cs[i+1]-'a'] = true;
            if (map[cs[i+1]-'a'][cs[i]-'a']) {
                return true;
            }
        }
        return false;
    }
}