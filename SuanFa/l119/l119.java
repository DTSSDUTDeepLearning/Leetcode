package SuanFa.l119;

import java.util.ArrayList;
import java.util.List;

public class l119 {

    public static List<Integer> getRow(int rowIndex) {
        int[] yanghui = new int[rowIndex+1];
        yanghui[0] = 1;
        for (int i = 1;i <= rowIndex;i++) {
            for (int j = i;j >= 1;j--) {
                yanghui[j] = yanghui[j] + yanghui[j-1];
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int num : yanghui) {
            result.add(num);
        }
        return result;
    }

    public static void main(String[] args) {
        getRow(4);
    }

}
