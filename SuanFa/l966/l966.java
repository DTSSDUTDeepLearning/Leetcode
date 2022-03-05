package SuanFa.l966;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class l966 {

    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> word1 = new HashSet<>();
        Map<String, String> word2 = new HashMap<>();
        Map<String, String> word3 = new HashMap<>();

        for (String word : wordlist) {
            word1.add(word);
            word2.putIfAbsent(word.toLowerCase(), word);
            word3.putIfAbsent(devowel(word.toLowerCase()), word);
        }

        int len = queries.length;
        String[] results = new String[len];
        for (int i = 0;i < len;i++) {
            if (word1.contains(queries[i])) {
                results[i] = queries[i];
            }
            else {
                String query_lower = queries[i].toLowerCase();
                if (word2.containsKey(query_lower)) {
                    results[i] = word2.get(query_lower);
                }
                else {
                    String query_vowel = devowel(queries[i].toLowerCase());
                    if (word3.containsKey(query_vowel)) {
                        results[i] = word3.get(query_vowel);
                    }
                    else {
                        results[i] = "";
                    }
                }
            }
        }
        return results;
    }

    public String devowel(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (isvowel(c)) {
                sb.append('*');
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public boolean isvowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
