package SuanFa.l832;

public class l832 {

    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] result = new int[n][n];
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                result[i][j] = 1 - image[i][n-j-1];
            }
        }
        return result;
    }
}
