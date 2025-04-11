package l2671;

public class l2671 {
}

class FrequencyTracker {
    private static final int N = 100001;
    private int[] fre;
    private int[] freCnt;

    public FrequencyTracker() {
        fre = new int[N];
        freCnt = new int[N];
    }

    public void add(int number) {
        freCnt[fre[number]]--;
        fre[number]++;
        freCnt[fre[number]]++;
    }

    public void deleteOne(int number) {
        if (fre[number] == 0) {
            return;
        }
        freCnt[fre[number]]--;
        fre[number]--;
        freCnt[fre[number]]++;
    }

    public boolean hasFrequency(int frequency) {
        return freCnt[frequency] > 0;
    }
}