package SuanFa.l1184;

public class l1184 {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            return distanceBetweenBusStops(distance, destination, start);
        }
        int zheng = 0;
        for (int i = start;i < destination;i++) {
            zheng+=distance[i];
        }
        int total = zheng;
        for (int i = destination;i < distance.length;i++) {
            total+=distance[i];
        }
        for (int i = 0;i < start;i++) {
            total+=distance[i];
        }
        return Math.min(zheng, total-zheng);
    }
}
