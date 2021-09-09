package SuanFa.l174;

public class l174 {

    public static int calculateMinimumHP(int[][] dungeon) {
        int len1 = dungeon.length;
        int len2 = dungeon[0].length;
        int[][] result = new int[len1][len2];
        result[len1-1][len2-1] = -Math.min(0, dungeon[len1-1][len2-1]);
        for (int i = len1-2;i >= 0;i--) {
            result[i][len2-1] = Math.max(0, result[i+1][len2-1]-dungeon[i][len2-1]);
        }
        for (int j = len2-2;j >= 0;j--) {
            result[len1-1][j] = Math.max(0, result[len1-1][j+1]-dungeon[len1-1][j]);
        }
        for (int i = len1-2;i >= 0;i--) {
            for (int j = len2-2;j >= 0;j--) {
                result[i][j] = Math.max(0, Math.min(result[i+1][j], result[i][j+1]) - dungeon[i][j]);
            }
        }
        return result[0][0]+1;
    }

    public static void main(String[] args) {
        int[][] dungeon1 = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        int[][] dungeon2 = {{0,-3}};
        System.out.println(calculateMinimumHP(dungeon1));
        System.out.println(calculateMinimumHP(dungeon2));
    }
}
