package SuanFa.l274;

import java.util.Arrays;

public class l274 {

    public static int hIndex(int[] citations) {
        int len = citations.length;
        int[] least = new int[len+1];
        for (int i = 0;i < len;i++) {
            least[Math.min(len, citations[i])]++;
        }
        int h = len;
        for (int sk = least[len];h > sk;sk+=least[h]) {
            h--;
        }
        return h;
    }

    public static void main(String[] args) {
        int[] citations1 = {2,3,1,2,1,8,7,5};
        int sum = 0;
        for (int cit : citations1) {
            sum+=cit;
        }
        System.out.println("总引用数为"+sum);
        System.out.println("h指数为"+hIndex(citations1));
    }
}
