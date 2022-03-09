package SuanFa.l1295;

public class l1295_1 {

    // 数学方法
//    执行用时：2 ms, 在所有 Java 提交中击败了59.03%的用户
//    内存消耗：38.3 MB, 在所有 Java 提交中击败了17.50%的用户
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for (int num : nums) {
            if ((int)Math.floor(Math.log10((double)num)+1) % 2 == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
