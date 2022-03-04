package SuanFa.l929;

import java.util.HashSet;
import java.util.Set;

public class l929 {

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] name = email.split("@");
            StringBuilder sb = new StringBuilder();
            for (char c : name[0].toCharArray()) {
                if (c == '+') {
                    break;
                }
                else if (c != '.') {
                    sb.append(c);
                }
            }
            sb.append("@");
            sb.append(name[1]);
            set.add(sb.toString());
        }
        return set.size();
    }
}
