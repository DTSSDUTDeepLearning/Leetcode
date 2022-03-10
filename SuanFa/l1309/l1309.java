package SuanFa.l1309;

public class l1309 {

    public String freqAlphabets(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < len-2) {
            if (cs[i+2] == '#') {
                sb.append((char)((cs[i]-'0')*10+(cs[i+1]-'0'+'a')));
                i+=3;
            }
            else {
                sb.append((char)(cs[i]-'0'+'a'));
                i++;
            }
        }
        for (;i < len;i++) {
            sb.append((char)(cs[i]-'0'+'a'));
        }
        return sb.toString();
    }
}
