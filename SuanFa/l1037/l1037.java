package SuanFa.l1037;

public class l1037 {

    public boolean isBoomerang(int[][] points) {
        int[] point1 = points[0];
        int[] point2 = points[1];
        int[] point3 = points[2];
        if (isequal(point1, point2) || isequal(point1, point3) || isequal(point2, point3)) {
            return false;
        }
        if (point1[0] == point2[0]) {
            return point1[0] != point3[0];
        }
        if (point2[0] == point3[0] || point1[0] == point3[0]) {
            return true;
        }
        double k = (double)(point2[1]-point1[1])/(point2[0]-point1[0]);
        return (double)(point3[1]-point2[1])/(point3[0]-point2[0])==k;
    }

    public boolean isequal(int[] point1, int[] point2) {
        return point1[0]==point2[0] && point1[1]==point2[1];
    }
}
