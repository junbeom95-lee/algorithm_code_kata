package code_020;

import java.util.Arrays;

public class CodeKata025 {  //나누어 떨어지는 숫자 배열
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt = 0;

        for(int num : arr) {
            if(num % divisor == 0)
                cnt++;
        }
        answer = new int[cnt];
        for(int i = 0, j = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[j++] = arr[i];
            }
        }

        Arrays.sort(answer);
        return (cnt == 0) ? new int[]{-1} : answer;

    }
}
