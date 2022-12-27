import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class SortString {

    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[][] substrings = new String[strings.length][2];
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            substrings[i][1] = String.valueOf(strings[i].charAt(n));
            substrings[i][0] = strings[i];
        }
        Arrays.sort(substrings,((o1, o2) -> {
        if (Objects.equals(o1[1], o2[1])){
            return CharSequence.compare(o1[0] ,o2[0]);
        }   else
            return CharSequence.compare(o1[1] , o2[1]);

        }
        ));
        for (int i = 0; i < strings.length; i++) {
            answer[i] = substrings[i][0];
        }
        return answer;
    }
}
