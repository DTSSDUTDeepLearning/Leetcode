package SuanFa.l1961;

public class l1961 {

    public boolean isPrefixString(String s, String[] words) {
        char[] cs = s.toCharArray();
        int index = 0;
        int len = cs.length;
        for (String word : words) {
            if (word.length() > len - index || s.indexOf(word, index) != index) {
                return false;
            }
            index += word.length();
            if (index == len) {
                return true;
            }
        }
        return false;
    }
}
