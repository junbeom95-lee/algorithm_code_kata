package code_050;

public class CodeKata059 {  //덧칠하기
    public int solution(int n, int m, int[] section) {
        int answer = 0;

        int clf = 0;

        for (int j = 0; j < section.length; j++) {

            if (answer == 0) {
                clf = section[j] + m - 1;
                answer++;
            }

            if (clf < section[j]) {
                clf = section[j] + m - 1;
                answer++;
            }

        }

        return answer;
    }
}
