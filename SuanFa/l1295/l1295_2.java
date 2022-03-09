package SuanFa.l1295;

public class l1295_2 {

    // 根据题意简单写
//    执行用时：1 ms, 在所有 Java 提交中击败了99.66%的用户
//    内存消耗：38 MB, 在所有 Java 提交中击败了77.21%的用户
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for (int num : nums) {
            if (num >= 10 && num <= 99 || num >= 1000 && num <= 9999) {
                cnt++;
            }
        }
        return cnt;
    }
}
