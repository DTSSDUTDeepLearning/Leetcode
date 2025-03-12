package l3200;

public class l3200 {

    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(maxHeight(red, blue), maxHeight(blue, red));
    }

    public int maxHeight(int a, int b) {
        int height = 0;
        while (a >= 0 && b >= 0) {
            height++;
            if (height % 2 == 1) {
                a-=height;
            }
            else {
                b-=height;
            }
        }
        return height-1;
    }
}