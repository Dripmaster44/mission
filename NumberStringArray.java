public class NumberStringArray {

    public int solution(String s) {
        int answer = 0;
            String zero = "zero";
            String one = "one";
            String two = "two";
            String three = "three";
            String four = "four";
            String five = "five";
            String six = "six";
            String seven = "seven";
            String eight = "eight";
            String nine = "nine";
            if (s.contains(zero)) {
                s = s.replace(zero, "0");
            }
            if (s.contains(one)) {
                s = s.replace(one, "1");
            }
            if (s.contains(two)) {
                s = s.replace(two, "2");
            }
            if (s.contains(three)) {
                s = s.replace(three, "3");
            }
            if (s.contains(four)) {
                s = s.replace(four, "4");
            }
            if (s.contains(five)) {
                s = s.replace(five, "5");
            }
            if (s.contains(six)) {
                s = s.replace(six, "6");
            }
            if (s.contains(seven)) {
                s = s.replace(seven, "7");
            }
            if (s.contains(eight)) {
                s = s.replace(eight, "8");
            }
            if (s.contains(nine)) {
                s = s.replace(nine, "9");
            }
        answer = Integer.parseInt(s);
        return answer;
    }
}
