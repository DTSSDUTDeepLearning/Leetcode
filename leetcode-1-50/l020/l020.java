package SuanFa.l020;

import java.util.Stack;

public class l020 {

    public boolean isValid(String s) {
        if (s.length() == 0)
            return true;
        Stack<Character> st = new Stack<>();
        char[] sc = s.toCharArray();
        for (char c : sc) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    st.push(c);
                    break;
                case ')':
                case ']':
                case '}':
                    if (st.empty()) {
                        return false;
                    } else {
                        char c1 = st.pop();
                        if (!((c1 == '(' && c == ')') ||
                                (c1 == '[' && c == ']') ||
                                (c1 == '{' && c == '}'))) {
                            return false;
                        }

                    }
                    break;
            }
        }
        if (st.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
