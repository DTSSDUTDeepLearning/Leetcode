package SuanFaPlus.l243;

public class l243 {

    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int min = Integer.MAX_VALUE;
        int len = wordsDict.length;
        int index1 = -1;
        int index2 = -1;
        for (int i = 0;i < len;i++) {
            if (wordsDict[i].equals(word1)) {
                index1 = i;
                if (index2 != -1) {
                    min = Math.min(min, Math.abs(index1 - index2));
                }
            }
            else if (wordsDict[i].equals(word2)) {
                index2 = i;
                if (index1 != -1) {
                    min = Math.min(min, Math.abs(index1 - index2));
                }
            }
        }
        return min;
    }
}
