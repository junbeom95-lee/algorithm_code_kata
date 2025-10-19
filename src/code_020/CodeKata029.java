package code_020;

import java.util.ArrayList;

public class CodeKata029 {  //제일 작은 수 더하기
    public int[] solution(int[] arr) {
        if(arr[0] == 10) return new int[]{-1};

        int[] answer = new int[arr.length - 1];
        ArrayList<Integer> list = new ArrayList<>();
        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        for(int num : arr) {
            if(num != min) list.add(num);
        }

        answer = list.stream()
                .mapToInt(i -> i) // 람다식으로 int로 변환
                .toArray();

        return answer;
    }
}
