import static java.lang.Math.abs;

public class Parallel {

    public int solution(int[][] dots) {
        int answer = 0;
        double x0 = dots[0][0];
        double x1 = dots[1][0];
        double x2 = dots[2][0];
        double x3 = dots[3][0];
        double y0 = dots[0][1];
        double y1 = dots[1][1];
        double y2 = dots[2][1];
        double y3 = dots[3][1];

        if ((y0 - y1) / (x0 - x1) == (y2 - y3) / (x2 - x3) || (y0 - y2) / (x0 - x2) == (y1 - y3) / (x1 - x3) ||
                (y0 - y3) / (x0 - x3) == (y1 - y2) / (x1 - x2)){
            answer +=1;
        }



        return answer;
    }


}
