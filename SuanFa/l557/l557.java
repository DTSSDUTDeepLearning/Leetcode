package SuanFa.l557;

public class l557 {

    public static String reverseWord(String s) {
        char[] word = s.toCharArray();
        int len = word.length;
        for (int i = 0;2*i < len;i++) {
            char tmp = word[i];
            word[i] = word[len-1-i];
            word[len-1-i] = tmp;
        }
        return new String(word);
    }

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int len = words.length;
        String result = "";
        for (int i = 0;i < len;i++) {
            result += (reverseWord(words[i])+" ");
        }
        return result.substring(0, result.length()-1);
    }
}
