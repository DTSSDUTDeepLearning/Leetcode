package SuanFa.l1408;

import java.util.LinkedList;
import java.util.List;

public class l1408 {

    public List<String> stringMatching(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
            sb.append(' ');
        }
        List<String> l = new LinkedList<>();
        for (String word : words) {
            if(sb.indexOf(word)!=sb.lastIndexOf(word)){
                l.add(word);
            }
        }
        return l;
    }
}
