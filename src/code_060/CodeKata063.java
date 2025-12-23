package code_060;

public class CodeKata063 {
    class Solution {
        public String solution(String X, String Y) {

            int[] x = new int[10];
            int[] y = new int[10];

            for (char c : X.toCharArray()) x[c - '0']++;
            for (char c : Y.toCharArray()) y[c - '0']++;

            //시간초과가 뜸 StringBuilder 사용
            StringBuilder sb = new StringBuilder();

            for (int i = 9; i >= 0; i--) {
                int cnt = Math.min(x[i], y[i]);
                for(int j = 0; j < cnt; j++) {
                    sb.append(i);
                }
            }

            if (sb.length() == 0) return "-1";
            //실행한 결괏값 "00"이 기댓값 "0"과 다릅니다.
            if (sb.charAt(0) == '0') return "0";

            return sb.toString();
        }
    }
}
