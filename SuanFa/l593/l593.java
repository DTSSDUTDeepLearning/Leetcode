package SuanFa.l593;

import java.util.Arrays;

public class l593 {

    public static int squ_distance(int[] p1, int[] p2) {
        return (int)(Math.pow((p2[0]-p1[0]), 2)+Math.pow((p2[1]-p1[1]), 2));
    }

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[][] ps = {p1, p2, p3, p4};
        Arrays.sort(ps, (l1, l2)->l2[0]==l1[0]?l1[1]-l2[1]:l1[0]-l2[0]); // 从小到大排序，首先根据第一项排，再根据第二项排
        return squ_distance(ps[0], ps[1]) != 0 && squ_distance(ps[0], ps[1]) == squ_distance(ps[1], ps[3]) && squ_distance(ps[1], ps[3]) == squ_distance(ps[2], ps[3]) && squ_distance(ps[2], ps[3]) == squ_distance(ps[0], ps[2]) && squ_distance(ps[0],ps[3])==squ_distance(ps[1],ps[2]);
    }
}
