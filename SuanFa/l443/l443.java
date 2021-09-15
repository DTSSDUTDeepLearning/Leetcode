package SuanFa.l443;

public class l443 {

    public static int compress(char[] chars) {
        int len = chars.length;
        char charprev = chars[0];
        int charlen = 1;
        int writeindex = 0;
        for (int i = 1;i < len;i++) {
            if (chars[i] != charprev) {
                chars[writeindex++] = charprev;
                if (charlen != 1) {
                    String s = Integer.valueOf(charlen).toString();
                    for (int j = 0;j < s.length();j++) {
                        chars[writeindex++] = s.charAt(j);
                    }
                    charlen = 1;
                }
                charprev = chars[i];
            }
            else {
                charlen++;
            }
        }
        if (charlen == 1) {
            chars[writeindex++] = charprev;
        }
        else {
            chars[writeindex++] = charprev;
            String s = Integer.valueOf(charlen).toString();
            for (int j = 0;j < s.length();j++) {
                chars[writeindex++] = s.charAt(j);
            }
        }
        return writeindex;
    }

    public static void main(String[] args) {
//        char[] chars1 = {'a','b','c','b','c','a','c'};
        char[] chars2 = {'a','a','a','b','b','c','c'};
//        System.out.println(compress(chars1));
        System.out.println(compress(chars2));
    }
}
