package SuanFa.l1366;

import java.util.*;

public class l1366 {

    public static String rankTeams(String[] votes) {
        int vote_people = votes.length;
        int team_num = votes[0].length();
        char[][] cs = new char[vote_people][team_num];
        for (int i = 0;i < vote_people;i++) {
            cs[i] = votes[i].toCharArray();
        }
        int[] team_index = new int[26];

        List<int[]> l = new LinkedList<>();
        for (int i = 0;i < team_num;i++) {
            team_index[cs[0][i]-'A'] = i;
            int[] tmp = new int[team_num+1];
            tmp[team_num] = cs[0][i]-'A';
            l.add(tmp);
        }

        for (int i = 0;i < vote_people;i++) {
            for (int j = 0;j < team_num;j++) {
                l.get(team_index[cs[i][j]-'A'])[j]++;
            }
        }

        Collections.sort(l, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                for (int i = 0;i < team_num;i++) {
                    if (o1[i] != o2[i]) {
                        return o2[i]-o1[i];
                    }
                }
                return o1[team_num]-o2[team_num];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < team_num;i++) {
            sb.append((char)(l.get(i)[team_num]+'A'));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] votes1 = {"ABC","ACB","ABC","ACB","ACB"};
        String[] votes2 = {"WXYZ","XYZW"};
        String[] votes3 = {"ZMNAGUEDSJYLBOPHRQICWFXTVK"};
        String[] votes4 = {"BCA","CAB","CBA","ABC","ACB","BAC"};
        String[] votes5 = {"M","M","M","M"};
        System.out.println(rankTeams(votes1));
        System.out.println(rankTeams(votes2));
        System.out.println(rankTeams(votes3));
        System.out.println(rankTeams(votes4));
        System.out.println(rankTeams(votes5));
    }
}
