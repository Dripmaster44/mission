public class CharacterCoordinate {

    public int[] solution(String[] keyinput, int[] board) {
        int row = board[1] / 2;
        int col = board[0] / 2;
        int[] answer = {0, 0};
        for (String s : keyinput) {
            switch (s) {
                case "up":
                    answer[1] += 1;
                    if (row < answer[1]) {
                        answer[1] -= 1;
                        break;
                    }
                    break;
                case "down":
                    answer[1] = answer[1] - 1;
                    if (row < -answer[1]) {
                        answer[1] = answer[1] + 1;
                        break;
                    }
                    break;
            }
        }
        for (String s : keyinput) {
            switch (s) {
                case "right":
                    answer[0] = answer[0] + 1;
                    if (col < answer[0]) {
                        answer[0] = answer[0] - 1;
                        break;
                    }
                    break;
                case "left":
                    answer[0] = answer[0] - 1;
                    if (col < -answer[0]) {
                        answer[0] = answer[0] + 1;
                        break;
                    }
                    break;

            }
        }

        return answer;
    }
}
