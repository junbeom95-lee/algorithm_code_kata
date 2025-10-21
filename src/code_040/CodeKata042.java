package code_040;

public class CodeKata042 {  //삼총사
    public int solution(int[] number) {
        int answer = 0;
        for(int i = 0; i < number.length - 2; i++) {
            for(int j = i + 1; j < number.length - 1; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    int num = number[i] + number[j] + number[k];
                    if (num == 0) answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CodeKata042 c = new CodeKata042();
        int result = c.solution(new int[]{-2, 3, 0, 2, -5});
        System.out.println("result = " + result);
    }
}
