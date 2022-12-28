import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumMissingNumber {


    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer -=numbers[i];
        }
        return answer;
    }

}
