package code_020;

import java.util.Arrays;

public class CodeKata029 {  //제일 작은 수 제거하기
    public int[] solution(int[] arr) {

        //최솟값
        int min = Arrays.stream(arr).min().orElse(10);

        int[] answer = Arrays.stream(arr)
                .filter(num -> num != min)
                .toArray();

        if(answer.length == 0) return new int[]{-1};
        else return answer;
    }
}
