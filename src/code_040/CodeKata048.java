package code_040;


import java.util.*;

public class CodeKata048 { //두 개 뽑아서 더하기
    public int[] solution(int[] numbers) {

        List<Integer> list = new ArrayList<>();

        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int x = numbers[i] + numbers[j];
                boolean exist = list.stream()
                        .anyMatch(a -> a == x);
                if(!exist) list.add(x);
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
    public int[] s(int[] numbers) {

        int[] answer = {};
        Set<Integer> set = new HashSet<>();

        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int x = numbers[i] + numbers[j];
                if(!set.contains(x)) set.add(x);
            }
        }

        answer = set.stream().mapToInt(x -> x.intValue()).toArray();

        Arrays.sort(answer);

        return answer;
    }



    public static void main(String[] args) {
        CodeKata048 c = new CodeKata048();
        int[] numbers = {2, 1, 3, 4, 1};
        int[] result = c.solution(numbers);
        System.out.println("result = " + result.toString());
    }
}
