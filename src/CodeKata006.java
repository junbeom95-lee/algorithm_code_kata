import java.util.Scanner;
public class CodeKata006 {  //두 수의 합 구하기
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 + num2;
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        CodeKata006 solution = new CodeKata006();
        int answer = solution.solution(num1, num2);
        System.out.println(answer);
    }
}
