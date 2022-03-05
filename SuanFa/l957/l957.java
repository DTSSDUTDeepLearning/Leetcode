package SuanFa.l957;

public class l957 {

    public int[] prisonAfterNDays(int[] cells, int n) {
        n = n % 14;
        if (n == 0) {
            n = 14;
        }
        for (int i = 0;i < n;i++) {
            int tmp = cells[0];
            for (int j = 1;j < 7;j++) {
                if ((tmp ^ cells[j+1]) == 0) {
                    tmp = cells[j];
                    cells[j] = 1;
                }
                else {
                    tmp = cells[j];
                    cells[j] = 0;
                }
            }
            cells[0] = cells[7] = 0;
        }
        return cells;
    }
}
