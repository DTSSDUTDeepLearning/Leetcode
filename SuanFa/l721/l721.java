package l721;

import java.util.*;

public class l721 {

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Integer> email2index = new HashMap<>();
        Map<String, String> email2name = new HashMap<>();
        int emailCount = 0;
        for (List<String> account : accounts) {
            String name = account.get(0);
            int len = account.size();
            for (int i = 1;i < len;i++) {
                String email = account.get(i);
                if (!email2index.containsKey(email)) {
                    email2index.put(account.get(i), emailCount++);
                    email2name.put(account.get(i), name);
                }
            }
        }
        int[] parent = new int[emailCount];
        for (int i = 0;i < emailCount;i++) {
            parent[i] = i;
        }
        for (List<String> account : accounts) {
            String firstEmail = account.get(1);
            int firstIndex = email2index.get(firstEmail);
            int len = account.size();
            for (int i = 2;i < len;i++) {
                String nextEmail = account.get(i);
                int nextIndex = email2index.get(nextEmail);
                union(parent, firstIndex, nextIndex);
            }
        }

        Map<Integer, List<String>> index2emails = new HashMap<>();
        for (String email : email2index.keySet()) {
            int index = find(parent, parent[email2index.get(email)]);
            List<String> account = index2emails.getOrDefault(index, new LinkedList<>());
            account.add(email);
            index2emails.put(index, account);
        }
        List<List<String>> result = new LinkedList<>();
        for (List<String> emails : index2emails.values()) {
            Collections.sort(emails);
            String name = email2name.get(emails.get(0));
            List<String> account = new LinkedList<>();
            account.add(name);
            account.addAll(emails);
            result.add(account);
        }
        return result;
    }

    public void union(int[] parent, int index1, int index2) {
        parent[find(parent, index2)] = find(parent, index1);
    }

    public int find(int[] parent, int index) {
        if (parent[index] != index) {
            parent[index] = find(parent, parent[index]);
        }
        return parent[index];
    }
}