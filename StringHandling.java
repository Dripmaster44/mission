public class StringHandling {

    public boolean solution(String s) {
        boolean answer = true;
        char[] digit = new char[s.length()];
        boolean[] trueOrFalse = new boolean[s.length()];

        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                digit[i] = s.charAt(i);
                trueOrFalse[i] = Character.isDigit(digit[i]);
            }
            for (int i = 0; i < s.length(); i++) {
                if (!trueOrFalse[i]) {
                    answer = false;
                    break;
                }
            }
        } else answer = false;

        return answer;
    }

}
