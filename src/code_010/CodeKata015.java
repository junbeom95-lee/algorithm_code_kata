package code_010;

import java.util.Scanner;

public class CodeKata015 {  //나머지가 1이 되는 수 찾기
    public int solution(int n) {
        for(int i = 2; i < n; i++) {
            if (n % i == 1) return i;   //가장 작은 값 바로 리턴
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        CodeKata015 solution = new CodeKata015();
        int answer = solution.solution(n);
        System.out.println(answer);
    }
}
