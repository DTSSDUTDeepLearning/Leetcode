package SuanFa.l1576;

public class l1576 {

    public String modifyString(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        if (len == 1) {
            return cs[0] == '?'?"a":s;
        }
        if (cs[0] == '?') {
            cs[0] = cs[1]=='a'?'b':'a';
        }
        for (int i = 1;i < len-1;i++) {
            if (cs[i] == '?') {
                if (cs[i+1] == cs[i-1]+1 || cs[i-1] == 'z' && cs[i+1] == 'a') {
                    if (cs[i-1] != 'z' && cs[i-1] != 'y') {
                        cs[i] = (char)(cs[i-1]+2);
                    }
                    else {
                        cs[i] = (char)(cs[i-1]-24);
                    }
                }
                else {
                    if (cs[i-1] != 'z') {
                        cs[i] = (char)(cs[i-1]+1);
                    }
                    else {
                        cs[i] = 'a';
                    }
                }
            }
        }
        if (cs[len-1] == '?') {
            if (cs[len-2] != 'z') {
                cs[len-1] = (char)(cs[len-2]+1);
            }
            else {
                cs[len-1] = 'a';
            }
        }
        return String.valueOf(cs);
    }
}
