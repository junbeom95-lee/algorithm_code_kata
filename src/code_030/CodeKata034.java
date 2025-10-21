package code_030;

import java.util.Arrays;

public class CodeKata034 {  //문자열 내림차순으로 배치하기
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);   //내림차순 정렬
        answer = new StringBuilder(new String(arr)).reverse().toString();   //역순
        Arrays.sort(arr);
        return answer;
    }

    public static void main(String[] args) {
        CodeKata034 c = new CodeKata034();
        String test = "Zbcdefg";
        String result = c.solution(test);
        System.out.println("result = " + result);
    }
}
