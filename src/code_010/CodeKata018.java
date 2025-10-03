package code_010;

import java.util.Scanner;

public class CodeKata018 {  //문자열을 정수로 바꾸기
    public int solution(String s) {
//        int answer = Integer.parseInt(s); //인라인화 하기 전
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        CodeKata018 solution = new CodeKata018();
        int answer = solution.solution(s);
        System.out.println(answer);
    }
}
