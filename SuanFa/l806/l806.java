package SuanFa.l806;

public class l806 {

    public int[] numberOfLines(int[] widths, String s) {
        int row = 0;
        int col = 0;
        for (char c : s.toCharArray()) {
            int l = widths[c-'a'];
            if (col + l > 100) {
                row++;
                col = l;
            }
            else {
                col+=l;
            }
        }
        return new int[]{row, col};
    }
}
