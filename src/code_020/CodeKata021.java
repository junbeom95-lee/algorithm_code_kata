package code_020;

import java.util.*;

public class CodeKata021 {  //하샤드의 수

    public boolean solution(int x) {
        boolean answer = true;
        int num = x;
        int val = 0;
        while(x > 0) {
            val += x % 10;
            x /= 10;
        }

        if(num % val == 0) return answer;
        else answer = false;
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        CodeKata021 solution = new CodeKata021();
        boolean answer = solution.solution(num);
        System.out.println(answer);
    }
}
