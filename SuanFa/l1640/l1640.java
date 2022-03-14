package SuanFa.l1640;

public class l1640 {

    public boolean canFormArray(int[] arr, int[][] pieces) {
        int len1 = arr.length;
        int len2 = pieces.length;
        for (int i = 0;i < len1;i++) {
            boolean flag = true;
            for (int j = 0;j < len2;j++) {
                if (arr[i] == pieces[j][0]) {
                    flag = false;
                    for (int k = 1;k < pieces[j].length;k++) {
                        if (arr[++i] != pieces[j][k]) {
                            return false;
                        }
                    }
                }
            }
            if (flag) {
                return false;
            }
        }
        return true;
    }
}
