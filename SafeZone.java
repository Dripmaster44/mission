import java.util.Arrays;

public class SafeZone {

    public int solution(int[][] board) {
        int n = board[0].length;
        int k = n + 2;
        int[][] bigBoard = new int[k][k];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    if (bigBoard[i][j] == 0) {
                        bigBoard[i][j] = 1;
                    }
                    if (bigBoard[i][j + 1] == 0) {
                        bigBoard[i][j + 1] = 1;
                    }
                    if (bigBoard[i][j + 2] == 0) {
                        bigBoard[i][j + 2] = 1;
                    }
                    if (bigBoard[i + 1][j] == 0) {
                        bigBoard[i + 1][j] = 1;
                    }
                    if (bigBoard[i+1][j+1] == 0){
                        bigBoard[i+1][j+1] = 1;
                    }
                    if (bigBoard[i + 1][j + 2] == 0) {
                        bigBoard[i + 1][j + 2] = 1;
                    }
                    if (bigBoard[i + 2][j] == 0) {
                        bigBoard[i + 2][j] = 1;
                    }
                    if (bigBoard[i + 2][j + 1] == 0) {
                        bigBoard[i + 2][j + 1] = 1;
                    }
                    if (bigBoard[i + 2][j + 2] == 0) {
                        bigBoard[i + 2][j + 2] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (bigBoard[i + 1][j + 1] == 0) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}

