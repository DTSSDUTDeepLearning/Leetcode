package SuanFa.l849;

public class l849_3 {

    // 按零分组，时间O(n)，空间O(1)
//    执行用时：2 ms, 在所有 Java 提交中击败了96.10%的用户
//    内存消耗：40.6 MB, 在所有 Java 提交中击败了32.47%的用户
    public int maxDistToClosest(int[] seats) {
        int len = seats.length;
        int first_1_id = 0;
        while (first_1_id < len && seats[first_1_id] == 0) {
            first_1_id++;
        }
        int result = first_1_id;
        int K = 0;
        for (int i = first_1_id + 1;i < len;i++) {
            if (seats[i] == 1) {
                result = Math.max(result, (K + 1) / 2);
                K = 0;
            }
            else {
                K++;
            }
        }
        result = Math.max(result, K);
        return result;
    }

    public static void main(String[] args) {
        int[] seats = {1,0,0,0,1,0,1};
        System.out.println(new l849_3().maxDistToClosest(seats));
    }
}
