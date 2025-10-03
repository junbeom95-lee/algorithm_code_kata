package code_010;
import java.util.Scanner;

public class CodeKata011 {  //짝수와 홀수
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0) answer = "Even";
        else answer = "Odd";
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        CodeKata011 codeKata011 = new CodeKata011();
        System.out.println(codeKata011.solution(num));
    }
}
