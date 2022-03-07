package Book_DataStruct_Algorithm.Sort;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Heap {

    public static void main(String[] args) {
        int[] arrays = {5,8,1,9,0,3,6,4,2,7};
        // 堆排序
        heap(arrays);
        System.out.println(Arrays.toString(arrays));
    }

    public static void heap(int[] arrays) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arrays) {
            pq.offer(num);
        }
        for (int i = 0;i < arrays.length;i++) {
            arrays[i] = pq.poll();
        }
    }
}
