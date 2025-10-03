package code_020;

import java.util.*;

public class CodeKata020 {  //정수 내림차순으로 배치하기

    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        char[] c = s.toCharArray();
        Arrays.sort(c);

        StringBuilder sb = new StringBuilder(new String(c));
        sb.reverse();

        answer = Long.parseLong(sb.toString());
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        CodeKata020 codeKata020 = new CodeKata020();
        System.out.println(codeKata020.solution(n));
    }
}
