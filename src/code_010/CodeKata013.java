package code_010;
import java.util.Scanner;
public class CodeKata013 {  //자릿수 더하기
    public int solution(int n) {
        int answer = 0;
        while(n > 0) {
            answer += n % 10;   //맨 끝 자리 더하기
            n /= 10;            //맨 끝 제거
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        CodeKata013 solution = new CodeKata013();
        int answer = solution.solution(n);
        System.out.println(answer);
    }
}
