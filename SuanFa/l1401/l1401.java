package SuanFa.l1401;

public class l1401 {

    public boolean checkOverlap(int radius, int x_center, int y_center, int x1, int y1, int x2, int y2) {
        if (y_center+radius < y1 || x_center+radius < x1 || y_center-radius > y2 || x_center-radius > x2) {
            return false;
        }
        if (x1 > x_center && y1 > y_center && dissqu(x1, y1, x_center, y_center) > radius*radius) {
            return false;
        }
        if (x2 < x_center&& y1 > y_center && dissqu(x2, y1, x_center, y_center) > radius*radius) {
            return false;
        }
        if (x2 < x_center && y2 < y_center && dissqu(x2, y2, x_center, y_center) > radius*radius) {
            return false;
        }
        if (x1 > x_center && y2 < y_center && dissqu(x1, y2, x_center, y_center) > radius*radius) {
            return false;
        }
        return true;
    }

    public int dissqu(int x1, int y1, int x2, int y2) {
        return (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
    }
}
