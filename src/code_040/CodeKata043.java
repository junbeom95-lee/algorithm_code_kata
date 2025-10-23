package code_040;

public class CodeKata043 {  //크기가 작은 부분문자열
    public int solution(String t, String p) {
        int answer = 0;
        int tLen = t.length();
        int pLen = p.length();
        long pNum = Long.parseLong(p);
        for(int i = 0; i <= tLen - pLen; i++) {
            String num1 = t.substring(i, i + pLen);
            if(Long.parseLong(num1) <= pNum) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        CodeKata043 c = new CodeKata043();
        int result = c.solution("10203", "15");
        System.out.println("result = " + result);
    }
}
