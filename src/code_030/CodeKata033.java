package code_030;

public class CodeKata033 {  //약수의 개수와 덧셈
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {    //left부터 시작
            int count = 0;
            for(int j = 1; j <= i; j++) {   //약수의 개수 확인
                if(i % j == 0) count++;     //약수이면 count 증가
            }
            if(count % 2 == 0) answer += i;//약수의 개수가 짝수면 더하기
            else answer -= i;               //약수의 개수하 홀수면 빼기
        }
        return answer;
    }
}
