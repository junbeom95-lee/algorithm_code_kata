package code_030;

public class CodeKata030 {  //가운데 글자 가져오기
    public String solution(String s) {
        String answer = "";
        int x = s.length();
        if (x % 2 == 0) {
            char a = s.charAt(x / 2 - 1 );
            char b = s.charAt((x / 2));
            answer += a;
            answer += b;
        } else {
            answer += s.charAt(x / 2);
        }
        return answer;
    }
    public String s(String s) {
        String answer = "";
        int length = s.length();
        System.out.println("mid = " + length);
        if(length % 2 == 0) {
            answer = s.substring(length / 2 - 1 , length / 2 + 1);

        } else {
            answer = s.substring(length / 2, length / 2 + 1);
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        CodeKata030 c = new CodeKata030();
        String test = "abcde";
        String result = c.s(test);
        System.out.println("result = " + result);
    }
}
