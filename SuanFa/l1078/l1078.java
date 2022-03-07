package SuanFa.l1078;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class l1078 {

    public String[] findOcurrences(String text, String first, String second) {
        List<String> result = new LinkedList<>();
        String[] words = text.split(" ");
        int len = words.length;
        for (int i = 0;i < len-2;i++) {
            if (words[i].equals(first) && words[i+1].equals(second)) {
                result.add(words[i+2]);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
