package code_050;


import java.util.Scanner;

public class CodeKata052 {  //콜라 문제
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a) {
            answer += (n / a) * b;
            n = (n / a) * b + (n % a);
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int n = s.nextInt();

        CodeKata052 c = new CodeKata052();

        int solution = c.solution(a, b, n);

        System.out.println("solution = " + solution);
    }
}
