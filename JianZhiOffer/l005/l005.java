package JianZhiOffer.l005;

public class l005 {

    public String replaceSpace(String s) {
        int l = s.length();
        int j = 0;
        for (int i = 0;i < l;i++) {
            if (s.charAt(i) == ' ') {
                j++;
            }
        }
        char[] c = new char[l+2*j];
        j = 0;
        for (int i = 0;i < l;i++) {
            if (s.charAt(i) == ' ') {
                c[j++] = '%';
                c[j++] = '2';
                c[j++] = '0';
            }
            else {
                c[j++] = s.charAt(i);
            }
        }
        String s1 = new String(c);
        return s1;
    }
}
