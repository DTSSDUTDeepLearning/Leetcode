package SuanFa.l1813;

public class l1813 {

    String[] words1;
    String[] words2;

    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (sentence1.length() < sentence2.length()) {
            return areSentencesSimilar(sentence2, sentence1);
        }
        if (sentence1.length() == sentence2.length()) {
            return sentence1.equals(sentence2);
        }
        words1 = sentence1.split(" ");
        words2 = sentence2.split(" ");
        if (words1.length <= words2.length) {
            return false;
        }
        if (words2.length == 1) {
            return words1[0].equals(words2[0]) || words1[words1.length-1].equals(words2[0]);
        }
        return are(0, words1.length-1, 0, words2.length-1);
    }

    public boolean are(int left1, int right1, int left2, int right2) {
        if (left2 > right2) {
            return true;
        }
        if (words1[left1].equals(words2[left2])) {
            if (words1[right1].equals(words2[right2])) {
                return are(left1+1, right1-1, left2+1, right2-1);
            }
            else {
                return are(left1+1, right1, left2+1, right2);
            }
        }
        else {
            if (words1[right1].equals(words2[right2])) {
                return are(left1, right1-1, left2, right2-1);
            }
            else {
                return false;
            }
        }
    }
}
