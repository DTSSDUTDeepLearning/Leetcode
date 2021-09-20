package SuanFa.l692;

import java.util.*;

public class l692 {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> m = new HashMap<>();
        for (String word : words) {
            m.put(word, m.getOrDefault(word, 0)+1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>(
                (w1, w2) -> m.get(w1).equals(m.get(w2)) ?
                        w2.compareTo(w1) : m.get(w1) - m.get(w2)
        );

        for (String word : m.keySet()) {
            pq.offer(word);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<String> results = new ArrayList<>();
        while (!pq.isEmpty()) {
            results.add(pq.poll());
        }
        Collections.reverse(results);
        return results;
    }
}
