package code_000;

import java.util.Scanner;
public class CodeKata003 {  //몫 구하기
    class Solution {
        public int solution(int num1, int num2) {
            int answer = 0;
            float mul = (float)num1 / num2;
            answer = (int)(mul * 1000);
            return answer;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        CodeKata003 solution = new CodeKata003();
        int answer = solution.new Solution().solution(num1, num2);
        System.out.println(answer);
    }
}
