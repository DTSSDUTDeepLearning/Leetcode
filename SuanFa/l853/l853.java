package SuanFa.l853;

import java.util.Arrays;

public class l853 {

    public int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        Car[] cars = new Car[len];
        for (int i = 0;i < len;i++) {
            cars[i] = new Car(target - position[i], speed[i], ((float)cars[i].dis) / cars[i].speed);
        }
        Arrays.sort(cars, (o1, o2) -> o1.dis - o2.dis);
        int cnt = len;
        for (int i = 0;i < len - 1;i++) {
            if (cars[i].speed < cars[i+1].speed) {
                if (((float)(cars[i+1].dis - cars[i].dis)) / (cars[i+1].speed - cars[i].speed) < cars[i].time) {
                    cnt--;
                    cars[i+1].time = cars[i].time;
                }
            }
        }
        return cnt;
    }
}

class Car {
    public int dis;
    public int speed;
    public float time;
    public Car(int dis, int speed, float time) {
        this.dis = dis;
        this.speed = speed;
        this.time = time;
    }
}