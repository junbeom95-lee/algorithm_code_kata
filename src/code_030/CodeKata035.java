package code_030;

public class CodeKata035 {  //부족한 금액 계산하기
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        for(int i = 1; i <= count; i++) {
            total += i * price;
        }
        answer = money - total;
        return answer >= 0 ? 0 : answer * -1;
    }
}
