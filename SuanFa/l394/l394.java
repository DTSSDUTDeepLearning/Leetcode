package SuanFa.l394;

import java.util.Deque;
import java.util.LinkedList;

public class l394 {

    // 使用栈来做
    public static String decodeString(String s) {
        int len = s.length();
        Deque<Integer> stack_num = new LinkedList<>();
        Deque<String> stack_str = new LinkedList<>();
        String number = "";
        String string = "";
        for (int i = 0;i < len;i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                number += c;
                if (number.length() == 1) {
                    stack_str.push(string);
                    string = "";
                }
            }
            else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                string += c;
            }
            else if (c == '[') {
                int num = Integer.valueOf(number);
                stack_num.push(num);
                number = "";
            }
            else if (c == ']') {
                int num = stack_num.poll();
                String r = "";
                for (int j = 0;j < num;j++) {
                    r += string;
                }
                string = stack_str.poll();
                string += r;
            }
        }
        return string;
    }

    public static void main(String[] args) {
        String s1 = "3[a]2[bc]";
        String s2 = "3[a2[c]]";
        String s3 = "2[abc]3[cd]ef";
        String s4 = "abc3[cd]xyz";
        String s5 = "10[a]2[bc]";
        String s6 = "3[a10[bc]]";
        System.out.println(decodeString(s1));
        System.out.println(decodeString(s2));
        System.out.println(decodeString(s3));
        System.out.println(decodeString(s4));
        System.out.println(decodeString(s5));
        System.out.println(decodeString(s6));
    }
}
