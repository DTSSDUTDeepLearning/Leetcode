package SuanFa.l1824;

public class l1824 {

    public int minSideJumps(int[] obstacles) {
        int cnt = 0;
        int len = obstacles.length;
        int saidao = 1;
        int i = 0;
        while (i < len) {
            while (i < len && obstacles[i] != saidao+1) {
                i++;
            }
            if (i == len) {
                return cnt;
            }
            i--;
            cnt++;
            if (saidao == 0) {
                saidao = change(i, 1, 2, len, obstacles);
            }
            else if (saidao == 1) {
                saidao = change(i, 0, 2, len, obstacles);
            }
            else {
                saidao = change(i, 0, 1, len, obstacles);
            }
        }
        return cnt;
    }

    public int change(int begin, int saidao1, int saidao2, int len, int[] obstacles) {
        int t1 = begin;
        while (t1 < len && obstacles[t1] != saidao1+1) {
            t1++;
        }
        int t2 = begin;
        while (t2 < len && obstacles[t2] != saidao2+1) {
            t2++;
        }
        return t1>t2?saidao1:saidao2;
    }
}
