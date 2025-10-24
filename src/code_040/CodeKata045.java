package code_040;

public class CodeKata045 {  //시저 암호
    public String solution(String s, int n) {
        String answer = "";

        char[] cArr = s.toCharArray();


        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];

            if(c == ' ') {
                answer += ' ';
            } else if (c >= 'A' && c <= 'Z') {
                c += n;
                if(c > 'Z') answer += (char)(c - 26);
                else answer += (char)(c);
            } else if (c >= 'a' && c <= 'z') {
                c += n;
                if(c > 'z') answer += (char)(c - 26);
                else answer += (char)(c);
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        CodeKata045 c = new CodeKata045();
        String s = c.solution("A B z A a", 4);
        System.out.println("s = " + s);
    }
}
