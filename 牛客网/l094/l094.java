package NowCoder.l094;

import java.util.*;

public class l094 {

    public int[] LFU (int[][] operators, int k) {
        // write code here
        if(operators==null)
            return new int[] {-1};
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        LinkedHashMap<Integer, Integer> count = new LinkedHashMap<Integer, Integer>();
        ArrayList<Integer> list  = new ArrayList<Integer>();
        for(int i=0;i<operators.length;i++) {
            int op = operators[i][0];
            int key = operators[i][1];
            if(op==1) {
                if(map.containsKey(key)) {
                    map.put(key, operators[i][2]);
                    count.put(key, count.get(key)+1);
                }else {
                    if(map.size()==k) {
                        int removekey = GetMinKey(count);
                        map.remove(removekey);
                        count.remove(removekey);
                    }
                    map.put(key, operators[i][2]);
                    if(count.containsKey(key))
                        count.put(key, count.get(key)+1);
                    else
                        count.put(key, 1);
                }
            }
            else if(op==2) {
                if(map.containsKey(key)) {
                    int val = map.get(key);
                    count.put(key, count.get(key)+1);
                    list.add(val);
                }else {
                    list.add(-1);
                }
            }
        }
        int []A = new int [list.size()];
        for(int i=0;i<list.size();i++) {
            A[i] = list.get(i);
        }
        return A;
    }

    public int GetMinKey(LinkedHashMap<Integer, Integer> count) {
        int minCount = Integer.MAX_VALUE;
        int key = 0;
        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if(entry.getValue()<minCount) {
                minCount = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }
}
