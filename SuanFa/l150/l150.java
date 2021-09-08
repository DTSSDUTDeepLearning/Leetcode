package SuanFa.l150;

import java.util.Stack;

public class l150 {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int len = tokens.length;
        for (int i = 0;i < len;i++) {
            String token = tokens[i];
            if (token.equals("+")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b+a);
            }
            else if (token.equals("-")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b-a);
            }
            else if (token.equals("*")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b*a);
            }
            else if (token.equals("/")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b/a);
            }
            else {
                s.push(Integer.valueOf(token));
            }
        }
        return s.peek();
    }

    public static void main(String[] args) {
        String[] tokens1 = {"2","1","+","3","*"};
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(tokens1));
        System.out.println(evalRPN(tokens2));
        System.out.println(evalRPN(tokens3));
    }
}
