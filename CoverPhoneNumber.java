import java.util.Objects;

public class CoverPhoneNumber {


    public String solution(String phone_number) {
        String answer = "";
        String[] splitPhone = new String[phone_number.length()];
        for (int i = 0; i < phone_number.length(); i++) {
            splitPhone[i] = String.valueOf(phone_number.charAt(i));
        }
        for (int i = 0; i < splitPhone.length -4; i++) {
            splitPhone[i] = "*";
        }
        for (int i = 0; i < splitPhone.length; i++) {
            answer = String.join("",splitPhone);
        }
        return answer;
    }


}
