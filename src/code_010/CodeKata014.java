package code_010;
import java.util.Scanner;
public class CodeKata014 {  //약수의 합
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) answer += i;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        CodeKata014 solution = new CodeKata014();
        int answer = solution.solution(n);
        System.out.println(answer);
    }
}
