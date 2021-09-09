package SuanFa.l151;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class l151 {

    public static String reverseWords(String s) {
        s = s.trim(); // 除去开头和末尾的空白字符
        List<String> wordList = Arrays.asList(s.split("\\s+")); // 正则匹配连续的空白字符作为分隔符分割
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String s2 = "  hello world!  ";
        String s3 = "a good   example";
        String s4 = "  Bob    Loves  Alice   ";
        String s5 = "Alice does not even like bob";
        System.out.println(reverseWords(s1));
        System.out.println(reverseWords(s2));
        System.out.println(reverseWords(s3));
        System.out.println(reverseWords(s4));
        System.out.println(reverseWords(s5));
    }
}
