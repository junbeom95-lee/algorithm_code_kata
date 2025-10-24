package code_040;

public class CodeKata046 {  // 숫자 문자열과 영단어

    public int solution(String s) {
        int answer = 0;
        String result = s;

        if(s.contains("zero")) result = result.replaceAll("zero", "0");
        if(s.contains("one")) result = result.replaceAll("one", "1");
        if(s.contains("two")) result = result.replaceAll("two", "2");
        if(s.contains("three")) result = result.replaceAll("three", "3");
        if(s.contains("four")) result = result.replaceAll("four", "4");
        if(s.contains("five")) result = result.replaceAll("five", "5");
        if(s.contains("six")) result = result.replaceAll("six", "6");
        if(s.contains("seven")) result = result.replaceAll("seven", "7");
        if(s.contains("eight")) result = result.replaceAll("eight", "8");
        if(s.contains("nine")) result = result.replaceAll("nine", "9");

        answer = Integer.parseInt(result);

        return answer;
    }

    public static void main(String[] args) {
        CodeKata046 c = new CodeKata046();
        int result = c.solution("2three45sixseven");
        System.out.println("result = " + result);
    }
}
