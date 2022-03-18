package NowCoder.l029;

public class l029 {

    public boolean Find(int target, int [][] array) {
        int m = array.length;
        int n = array[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (array[i][j] == target) {
                return true;
            }
            else if (array[i][j] < target) {
                i++;
            }
            else {
                j--;
            }
        }
        return false;
    }
}
