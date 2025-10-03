import java.util.Scanner;
public class CodeKata009 {  //짝수의 합
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i=i+2) answer += i;
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        CodeKata009 solution = new CodeKata009();
        int answer = solution.solution(n);
        System.out.println(answer);
    }
}
