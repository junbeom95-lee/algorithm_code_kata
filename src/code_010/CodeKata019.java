package code_010;

import java.util.Scanner;

public class CodeKata019 {  //정수 제곱근 판별
    public long solution(long n) {  //Math.sqrt 활용 -> i * i 까지 돌리는데 시간 소요
        long sqrt = (long)Math.sqrt(n);
        if(sqrt * sqrt == n) return (sqrt + 1) * (sqrt + 1);
        else { return -1; }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        CodeKata019 codeKata019 = new CodeKata019();
        System.out.println(codeKata019.solution(n));
    }
}
