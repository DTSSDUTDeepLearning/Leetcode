package SuanFa.l1417;

import java.util.LinkedList;
import java.util.List;

public class l1417 {

    public String reformat(String s) {
        if (s.length() == 1) {
            return s;
        }
        char[] cs = s.toCharArray();
        List<Character> number = new LinkedList<>();
        List<Character> character = new LinkedList<>();
        for (char c : cs) {
            if (c >= 'a' && c <= 'z') {
                character.add(c);
            } else {
                number.add(c);
            }
        }
        int number_len = number.size();
        int char_len = character.size();
        if (Math.abs(number_len - char_len) > 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (number_len > char_len) {
            for (int i = 0;i < char_len;i++) {
                sb.append(number.get(i));
                sb.append(character.get(i));
            }
            sb.append(number.get(char_len));
        }
        else if (number_len == char_len) {
            for (int i = 0;i < char_len;i++) {
                sb.append(number.get(i));
                sb.append(character.get(i));
            }
        }
        else {
            for (int i = 0;i < number_len;i++) {
                sb.append(character.get(i));
                sb.append(number.get(i));
            }
            sb.append(character.get(number_len));
        }
        return sb.toString();
    }
}
