import java.util.Objects;
import java.util.logging.XMLFormatter;

public class OXQuiz {

    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++){
            String[] split = quiz[i].split(" ");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[2]);
            int z = Integer.parseInt(split[4]);
            if (split[1].equals("+")){
                answer[i] = x + y == z ? "O" : "X";
            }
            if (split[1].equals("-")){
                answer[i] = x - y == z ? "O" : "X";
            }
        }
        return answer;
    }

}
