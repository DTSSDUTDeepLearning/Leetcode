package l895;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class FreqStack {

    Map<Integer, Deque<Integer>> freqStack;
    Map<Integer, Integer> freqMap;
    int maxFreq;

    public FreqStack() {
        freqStack = new HashMap<>();
        freqMap = new HashMap<>();
        maxFreq = 0;
    }

    public void push(int val) {
        int freq = freqMap.getOrDefault(val, 0)+1;
        maxFreq = Math.max(maxFreq, freq);
        freqMap.put(val, freq);
        freqStack.putIfAbsent(freq, new ArrayDeque<>());
        freqStack.get(freq).push(val);
    }

    public int pop() {
        int val = freqStack.get(maxFreq).pop();
        if (freqStack.get(maxFreq).isEmpty()) {
            maxFreq--;
        }
        freqMap.put(val, freqMap.get(val)-1);
        return val;
    }
}
