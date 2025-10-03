package code_010;

import java.util.Scanner;

public class CodeKata017 {  //자연수 뒤집어 배열로 만들기
    public int[] solution(long n) {
        String str = String.valueOf(n); //숫자를 문자열로 변환
        int[] answer = new int[str.length()];

        for(int i = 0 ; i < answer.length ; i++) {
            char c = str.charAt(str.length() - 1 - i);
            answer[i] = Integer.parseInt(String.valueOf(c));
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
        CodeKata017 solution = new CodeKata017();
        int[] answer = solution.solution(n);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
