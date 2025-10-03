import java.util.Scanner;
public class CodeKata005 {  //숫자 비교하기
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2) answer = 1;
        else answer = -1;
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        CodeKata005 solution = new CodeKata005();
        int answer = solution.solution(num1, num2);
        System.out.println(answer);
    }
}
