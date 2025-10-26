package code_040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodeKata048 {  //K번째 수
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> midAnswer = new ArrayList<>();

        for(int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<>();
            int x = commands[i][0];
            int y = commands[i][1];
            int z = commands[i][2];
            for(int j = x - 1; j < y; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            midAnswer.add(list.get(z - 1));
        }
        answer = midAnswer.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void main(String[] args) {
        CodeKata048 c = new CodeKata048();
        int[] a = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] b = new int[][]{{2, 5, 3}, {4, 4, 1, }, {1, 7, 3}};
        int[] result = c.solution(a, b);

        System.out.println("result = " + Arrays.toString(result));
    }
}
