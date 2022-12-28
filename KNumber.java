import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KNumber {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            if (commands[i][0] == commands[i][1]){
                answer[i] = array[commands[i][0]-1];
            } else {int[] copyarr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(copyarr);
            answer[i] = copyarr[commands[i][2]-1];
            }
        }
        return answer;
    }
}
