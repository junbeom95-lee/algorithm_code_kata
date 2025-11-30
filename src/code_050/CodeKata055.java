package code_050;

public class CodeKata055 {  //카드 뭉치
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int j = 0;
        int k = 0;

        for (String g : goal) {
            if (j < cards1.length && cards1[j].equals(g)) {
                j++;
            } else if (k < cards2.length && cards2[k].equals(g)) {
                k++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
