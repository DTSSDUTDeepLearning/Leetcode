package l853;

import java.util.Arrays;

public class l853 {

    public int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        Car[] cars = new Car[len];
        for (int i = 0;i < len;i++) {
            cars[i] = new Car(target-position[i], (float)(target-position[i])/speed[i]);
        }
        Arrays.sort(cars, (o1, o2) -> o2.dis - o1.dis);
        int cnt = 1;
        for (int i = len-2;i >= 0;i--) {
            if (cars[i+1].time < cars[i].time) {
                cnt++;
            }
            else {
                cars[i].time = cars[i+1].time;
            }
        }
        return cnt;
    }
}

class Car {
    public int dis;
    public float time;
    public Car(int dis, float time) {
        this.dis = dis;
        this.time = time;
    }
}