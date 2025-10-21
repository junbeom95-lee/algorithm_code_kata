package code_030;

public class CodeKata031 {  //수박수박?
    public String solution(int n) {
        String answer = "";
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) answer += "수";
            else answer += "박";
        }
        return answer;
    }
    public String S(int n) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) answer.append("수");
            else answer.append("박");
        }
        return answer.toString();
    }
}
