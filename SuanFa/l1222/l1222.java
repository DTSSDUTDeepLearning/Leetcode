package SuanFa.l1222;

import java.util.*;

public class l1222 {

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> results = new LinkedList<>();
        boolean[][] flag = new boolean[8][8];
        for (int[] queen : queens) {
            flag[queen[0]][queen[1]] = true;
        }
        for (int i = 1;i <= king[1];i++) {
            if (flag[king[0]][king[1]-i]) {
                List<Integer> result = new LinkedList<>();
                result.add(king[0]);
                result.add(king[1]-i);
                results.add(result);
                break;
            };
        }
        for (int i = 1;i <= Math.min(king[0], king[1]);i++) {
            if (flag[king[0]-i][king[1]-i]) {
                List<Integer> result = new LinkedList<>();
                result.add(king[0]-i);
                result.add(king[1]-i);
                results.add(result);
                break;
            }
        }
        for (int i = 1;i <= king[0];i++) {
            if (flag[king[0]-i][king[1]]) {
                List<Integer> result = new LinkedList<>();
                result.add(king[0]-i);
                result.add(king[1]);
                results.add(result);
                break;
            }
        }
        for (int i = 1;i <= Math.min(king[0], 7-king[1]);i++) {
            if (flag[king[0]-i][king[1]+i]) {
                List<Integer> result = new LinkedList<>();
                result.add(king[0]-i);
                result.add(king[1]+i);
                results.add(result);
                break;
            }
        }
        for (int i = 1;i <= 7-king[1];i++) {
            if (flag[king[0]][king[1]+i]) {
                List<Integer> result = new LinkedList<>();
                result.add(king[0]);
                result.add(king[1]+i);
                results.add(result);
                break;
            };
        }
        for (int i = 1;i <= Math.min(7-king[0], 7-king[1]);i++) {
            if (flag[king[0]+i][king[1]+i]) {
                List<Integer> result = new LinkedList<>();
                result.add(king[0]+i);
                result.add(king[1]+i);
                results.add(result);
                break;
            }
        }
        for (int i = 1;i <= 7-king[0];i++) {
            if (flag[king[0]+i][king[1]]) {
                List<Integer> result = new LinkedList<>();
                result.add(king[0]+i);
                result.add(king[1]);
                results.add(result);
                break;
            };
        }
        for (int i = 1;i <= Math.min(7-king[0], king[1]);i++) {
            if (flag[king[0]+i][king[1]-i]) {
                List<Integer> result = new LinkedList<>();
                result.add(king[0]+i);
                result.add(king[1]-i);
                results.add(result);
                break;
            }
        }
        return results;
    }
}
