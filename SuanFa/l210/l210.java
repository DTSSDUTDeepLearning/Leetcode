package SuanFa.l210;

import java.util.LinkedList;
import java.util.List;

public class l210 {

    // 同l207,题目没读对，其实我的有向图，刚好反向了。不过代码跑起来没问题
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] next = new List[numCourses];
        int[] inDegree = new int[numCourses];
        for (int i = 0;i < numCourses;i++) {
            next[i] = new LinkedList<>();
        }
        for (int[] pre : prerequisites) {
            inDegree[pre[1]]++;
            next[pre[0]].add(pre[1]);
        }
        int[] result = new int[numCourses];
        for (int i = 0;i < numCourses;i++) {
            int index = 0;
            while (index < numCourses && inDegree[index] != 0) {
                index++;
            }
            if (index == numCourses) {
                return new int[]{};
            }
            for (int out : next[index]) {
                inDegree[out]--;
            }
            inDegree[index] = -1;
            result[numCourses-i-1] = index;
        }
        return result;
    }
}
