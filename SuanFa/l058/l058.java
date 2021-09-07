package SuanFa.l058;

public class l058 {

    public static int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int last = s.length()-1;
        while (last > 0 && s.charAt(last) == ' ') {
            last--;
        }
        int sentence_end = last;
        for (;last >= 0;last--) {
            if (s.charAt(last) == ' ') {
                return sentence_end-last;
            }
        }
        return sentence_end+1;
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "a";
        String s3 = "   a";
        String s4 = "a   ";
        String s5 = "   a   ";
        System.out.println(lengthOfLastWord(s1));
        System.out.println(lengthOfLastWord(s2));
        System.out.println(lengthOfLastWord(s3));
        System.out.println(lengthOfLastWord(s4));
        System.out.println(lengthOfLastWord(s5));
    }
}
