package code_040;

import java.util.Arrays;

public class CodeKata047 {  //문자열 내 마음대로 정렬하기
    public String[] solution(String[] strings, int n) {
        String[] answer;

        for(int i = 0; i < strings.length - 1; i++) {
            for(int j = i + 1; j < strings.length; j++) {
                char c1 = strings[i].charAt(n);
                char c2 = strings[j].charAt(n);
                if(c1 > c2) {
                    String s = strings[i];
                    strings[i] = strings[j];
                    strings[j] = s;
                } else if (c1 == c2) {
                    if(strings[i].compareTo(strings[j]) > 0) {
                        String s = strings[i];
                        strings[i] = strings[j];
                        strings[j] = s;
                    }
                }
            }
        }
        answer = strings;
        return answer;
    }

    public static void main(String[] args) {
        CodeKata047 c = new CodeKata047();
        String[] ss = c.solution(new String[]{"abce", "abcd", "cdx"}, 2);
        System.out.println("ss = " + Arrays.toString(ss));
    }
}
