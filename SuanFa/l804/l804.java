package SuanFa.l804;

import java.util.HashSet;
import java.util.Set;

public class l804 {

    public int uniqueMorseRepresentations(String[] words) {
        String[] mosi = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> s = new HashSet<>();
        for (String word : words) {
            StringBuilder pw = new StringBuilder();
            for (char c : word.toCharArray()) {
                pw.append(mosi[c - 'a']);
            }
            s.add(pw.toString());
        }
        return s.size();
    }
}
