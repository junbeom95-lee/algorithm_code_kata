package code_020;

import java.util.*;

public class CodeKata022 {  //두 정수의 합
    public long solution(int a, int b) {
        long answer = 0;
        if(a >= b) {
            for(; b <= a; b++) {
                answer += b;
            }
        }
        else {
            for(; a <= b; a++) {
                answer += a;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        CodeKata022 solution = new CodeKata022();
        long answer = solution.solution(a, b);
        System.out.println(answer);
    }

}
