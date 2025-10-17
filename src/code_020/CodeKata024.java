package code_020;

import java.util.*;

public class CodeKata024 {  //서울에서 김서방 찾기
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        for(int i = 0 ; i < seoul.length; i++) {
            if(seoul[i].equals("Kim"))
                answer = answer + i + "에 있다";
        }
        return answer;
    }

    public String solution2(String[] seoul) {
        int i = Arrays.asList(seoul).indexOf("Kim");    //배열을 리스트로 변환하여 Kim의 인덱스를 반환
        return "김서방은 " + i + "에 있다";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] tokens = line.split(" ");
        scanner.close();
        CodeKata024 solution = new CodeKata024();
        String answer = solution.solution(tokens);
        System.out.println(answer);
    }
}
