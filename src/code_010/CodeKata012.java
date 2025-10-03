package code_010;
import java.util.Scanner;
public class CodeKata012 {  //평균 구하기
    public double solution(int[] arr) {
        double answer = 0;
        for(int num : arr) answer += num;
        answer /= arr.length;
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++) arr[i] = scanner.nextInt();
        scanner.close();
        CodeKata012 solution = new CodeKata012();
        double answer = solution.solution(arr);
        System.out.println(answer);
    }
}
