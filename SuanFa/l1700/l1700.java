package SuanFa.l1700;

public class l1700 {

    public int countStudents(int[] students, int[] sandwiches) {
        int[] cnt_stu = new int[2];
        for (int stu : students) {
            cnt_stu[stu]++;
        }
        int len = sandwiches.length;
        for (int i = 0;i < len;i++) {
            if (cnt_stu[sandwiches[i]] > 0) {
                cnt_stu[sandwiches[i]]--;
            }
            else {
                return len - i;
            }
        }
        return 0;
    }
}
