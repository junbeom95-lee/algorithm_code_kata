package code_030;

public class CodeKata036 {  //문자열 다루기 기본
    public boolean solution(String s) {
        boolean answer = false;
        if (s.length() == 4 || s.length() == 6) {
            try {
                Integer.parseInt(s);
                return true;
            } catch (Exception ignored) {
                return answer;
            }
        }
        return answer;
    }
    public boolean s (String s) {
        boolean answer = false;
        if ( s.length() == 4 || s.length() == 6) {
            return s.chars().allMatch(Character::isDigit);
        }
        return answer;
    }

    public static void main(String[] args) {
        CodeKata036 c = new CodeKata036();
        boolean result = c.solution("00h000");
        System.out.println("result = " + result);
    }
}
