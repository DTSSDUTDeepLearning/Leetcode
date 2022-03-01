package SuanFa.l841;

import java.util.List;

public class l841_1 {

    // 深度优先搜索
//    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
//    内存消耗：38.5 MB, 在所有 Java 提交中击败了11.76%的用户
    int n;
    boolean[] flag;
    List<List<Integer>> rooms;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        this.rooms = rooms;
        n = rooms.size();
        flag = new boolean[n];
        flag[0] = true;
        dfs(0);
        for (int i = 0;i < n;i++) {
            if (!flag[i]) {
                return false;
            }
        }
        return true;
    }

    public void dfs(int x) {
        for (int r : rooms.get(x)) {
            if (!flag[r]) {
                flag[r] = true;
                dfs(r);
            }
        }
    }
}
