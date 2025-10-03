package code_000;

import java.util.Scanner;
public class CodeKata004 {  //나이 출력
    public int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        scanner.close();
        CodeKata004 solution = new CodeKata004();
        int answer = solution.solution(age);
        System.out.println(answer);
    }
}
