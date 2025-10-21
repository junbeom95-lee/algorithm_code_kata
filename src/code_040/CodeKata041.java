package code_040;

public class CodeKata041 {  //이상한 문자 만들기
    public String solution(String s) {
        String answer = "";
        StringBuilder result = new StringBuilder();

        String[] list = s.split(" ", -1);
        for(int i = 0; i< list.length; i++) {
            String word = list[i];
            for(int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (j % 2 == 0) result.append(Character.toUpperCase(c));
                else result.append(Character.toLowerCase(c));
            }
            if(i < list.length -1) result.append(" ");
            System.out.println(result);
        }

        answer = new String(result);
        return answer;
    }

    public static void main(String[] args) {
        CodeKata041 c = new CodeKata041();
        String result = c.solution("try hello world");
        System.out.println("result = " + result);
    }
}
