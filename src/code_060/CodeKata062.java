package code_060;

public class CodeKata062 {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] str = {"aya", "ye", "woo", "ma"};

        for (String s : babbling) {
            int index = 0;
            String a = "";

            while (index < s.length()) {
                boolean m = false;

                for (String valum : str) {

                    if (s.startsWith(valum, index) && !valum.equals(a)) {

                        index += valum.length();
                        a = valum;

                        m = true;
                        break;
                    }
                }
                if (!m) break;
            }
            if (index == s.length()) answer++;
        }
        return answer;
    }
}
