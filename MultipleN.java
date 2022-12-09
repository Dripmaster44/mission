import java.util.ArrayList;
import java.util.List;


class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> array = new ArrayList<>();
        for (int num : numlist){
            if (num % n == 0){
                array.add(num);
            }
        }
        int[] answer = new int[array.size()];
        for(int i = 0; i <answer.length; i++){
            answer[i] = array.get(i);
        }
        return answer;
    }
}