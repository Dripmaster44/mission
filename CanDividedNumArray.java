import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CanDividedNumArray {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        int length = 0;
        int[] empty = {-1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0){
                length +=1;
                list.add(arr[i]);
            }
        }
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            answer[i] = list.get(i);
        }
        if (length == 0){
            answer = empty;
        }
        Arrays.sort(answer);
        return answer;
    }
}
