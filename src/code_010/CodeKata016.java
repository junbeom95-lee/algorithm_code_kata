package code_010;

import java.util.Scanner;

public class CodeKata016 {  //x만큼 간격이 있는 n개의 숫자
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0 ; i < n ; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        CodeKata016 solution = new CodeKata016();
        long[] answer = solution.solution(x, n);
        for (long l : answer) {
            System.out.println(l);
        }
    }
}
