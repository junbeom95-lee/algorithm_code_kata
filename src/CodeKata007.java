import java.util.Scanner;
public class CodeKata007 {  //두 수의 나눗셈
    public int solution(int num1, int num2) {
        int answer = 0;
        float mul = (float)num1 / num2;
        answer = (int)(mul * 1000);
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        CodeKata007 solution = new CodeKata007();
        int answer = solution.solution(num1, num2);
        System.out.println(answer);
    }
}
