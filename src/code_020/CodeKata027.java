package code_020;

public class CodeKata027 {  //핸드폰 번호 가리기
    public String solution(String phone_number) {
        String answer = "";
        String stars = "*".repeat(phone_number.length() - 4);
        String last4 = phone_number.substring(phone_number.length() - 4);
        answer = stars + last4;
        return answer;
    }
}
