package code_010;

import java.util.Scanner;
public class CodeKata010 {  //배열의 평균값
    public double solution(int[] numbers) {
        double answer = 0;
        for (int number : numbers) answer += number;
        answer /= numbers.length;
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) numbers[i] = scanner.nextInt();
        scanner.close();
        CodeKata010 solution = new CodeKata010();
        double answer = solution.solution(numbers);
        System.out.println(answer);
    }
}
