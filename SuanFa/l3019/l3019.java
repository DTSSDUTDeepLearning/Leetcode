package l3019;

public class l3019 {

    public int countKeyChanges(String s) {
        int result = 0;
        char[] cs = s.toCharArray();
        cs[0] = transfer(cs[0]);
        for (int i = 1;i < cs.length;i++) {
            cs[i] = transfer(cs[i]);
            if (cs[i-1] != cs[i]) {
                result++;
            }
        }
        return result;
    }

    public char transfer(char c) {
        if (c>='A' && c<='Z') {
            return (char)(c-'A'+'a');
        }
        else {
            return c;
        }
    }
}
