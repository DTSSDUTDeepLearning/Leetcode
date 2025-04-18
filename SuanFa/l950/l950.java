package l950;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class l950 {

    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> index = new LinkedList<>();
        for (int i = 0;i < deck.length;i++) {
            index.add(i);
        }
        int[] result = new int[deck.length];
        Arrays.sort(deck);
        for (int num : deck) {
            result[index.pollFirst()] = num;
            if (!index.isEmpty()) {
                index.add(index.pollFirst());
            }
        }
        return result;
    }
}
