import java.util.Scanner;

public class CodeKata004 {
    public int solution(int angle) {
        int answer = 0;
        if (angle > 0 && angle < 90) answer = 1;
        else if (angle == 90) answer = 2;
        else if (angle < 180) answer = 3;
        else answer = 4;
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angle = scanner.nextInt();
        scanner.close();
        CodeKata004 solution = new CodeKata004();
        int answer = solution.solution(angle);
        System.out.println(answer);
    }
}
