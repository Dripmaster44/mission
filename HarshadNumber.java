public class HarshadNumber {



    public boolean solution(int x) {
        boolean answer = true;
        int answerSum = 0;
        int Xlength = (int)(Math.log10(x)+1);
        int[] charX = new int[Xlength];
        for (int i = 0; i < Xlength; i++) {
            charX[i] = Integer.parseInt(String.valueOf(String.valueOf(x).charAt(i)));
            answerSum += charX[i];
        }
        if (x % answerSum != 0){
            answer = false;
        }
        return answer;
    }

}

