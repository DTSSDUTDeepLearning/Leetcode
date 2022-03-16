package SuanFa.l1832;

public class l1832 {

    public boolean checkIfPangram(String sentence) {
        boolean[] ch = new boolean[26];
        for (char c : sentence.toCharArray()) {
            ch[c-'a'] = true;
        }
        for (int i = 0;i < 26;i++) {
            if (!ch[i]) {
                return false;
            }
        }
        return true;
    }
}
