package code_020;

import java.util.*;
public class CodeKata023 {  //콜라츠 추축
    public int solution(int num) {
        long n = num;
        int answer = 0;

        if(n == 1) return 0;

        while(n != 1 && answer < 500) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            answer++;
        }
        return (n == 1) ? answer : -1;  // 조건문 사용해봄
//        if(n == 1) return answer;
//        else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        CodeKata023 solution = new CodeKata023();
        int answer = solution.solution(num);
        System.out.println(answer);
    }
}
