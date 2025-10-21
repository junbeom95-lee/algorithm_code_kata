package code_030;

public class CodeKata039 {  //최대공약수와 최소공배수
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
}
