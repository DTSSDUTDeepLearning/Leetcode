package SuanFa.l622;

public class MyCircularQueue {

    int size;
    int front;
    int cnt;
    int[] queue;

    public MyCircularQueue(int k) {
        size = k;
        queue = new int[size];
        front = 0;
        cnt = 0;
    }

    public boolean enQueue(int value) {
        if (cnt == size) {
            return false;
        }
        queue[(front + cnt) % size] = value;
        cnt++;
        return true;
    }

    public boolean deQueue() {
        if (cnt == 0) {
            return false;
        }
        front = (front + 1) % size;
        cnt--;
        return true;
    }

    public int Front() {
        if (cnt == 0) {
            return -1;
        }
        return queue[front];
    }

    public int Rear() {
        if (cnt == 0) {
            return -1;
        }
        return queue[(front + cnt - 1) % size];
    }

    public boolean isEmpty() {
        return cnt == 0;
    }

    public boolean isFull() {
        return cnt == size;
    }
}
