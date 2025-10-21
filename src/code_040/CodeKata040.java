package code_040;

public class CodeKata040 {  //

    public int solution(int n) {
        int answer = 0;
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            result.append(n % 3);
            n /= 3;
        }
        answer = Integer.parseInt(result.toString(), 3);
        return answer;
    }

    public static void main(String[] args) {
        CodeKata040 c = new CodeKata040();
        int result = c.solution(45);
        System.out.println("result = " + result);

    }
}
