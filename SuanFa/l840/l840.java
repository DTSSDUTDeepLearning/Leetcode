package SuanFa.l840;

public class l840 {

    public int numMagicSquaresInside(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cnt = 0;
        for (int i = 0;i < m - 2;i++) {
            for (int j = 0;j < n - 2;j++) {
                if (grid[i+1][j+1] == 5 && isMagic(new int[]{grid[i][j], grid[i][j + 1], grid[i][j + 2],
                        grid[i + 1][j], grid[i + 1][j + 1], grid[i + 1][j + 2],
                        grid[i + 2][j], grid[i + 2][j + 1], grid[i + 2][j + 2]})) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public boolean isMagic(int[] nums) {
        int[] cnt = new int[9];
        for (int num : nums) {
            if (num == 0 || num > 9 || cnt[num-1] == 1) {
                return false;
            }
            cnt[num-1] = 1;
        }
        return nums[0] + nums[1] + nums[2] == 15 &&
                nums[3] + nums[4] + nums[5] == 15 &&
                nums[6] + nums[7] + nums[8] == 15 &&
                nums[0] + nums[3] + nums[6] == 15 &&
                nums[1] + nums[4] + nums[7] == 15 &&
                nums[2] + nums[5] + nums[8] == 15 &&
                nums[0] + nums[4] + nums[8] == 15 &&
                nums[2] + nums[4] + nums[6] == 15;
    }
}
