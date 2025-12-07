package code_060;

public class CodeKata061 {  //로또의 최고 순위와 최저 순위
    public int[] solution(int[] lottos, int[] win_nums) {

        int cnt = 0;
        int zeroCnt = 0;

        for (int i = 0; i < 6; i++) {

            if(lottos[i] == 0) {
                zeroCnt++;
                continue;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) cnt++;
            }
        }

        int min;
        int max;

        if (cnt < 2) min = 6;
        else if (cnt < 3) min = 5;
        else if (cnt < 4) min = 4;
        else if (cnt < 5) min = 3;
        else if (cnt < 6) min = 2;
        else min = 1;

        if (cnt + zeroCnt < 2) max = 6;
        else if (cnt + zeroCnt < 3) max = 5;
        else if (cnt + zeroCnt < 4) max = 4;
        else if (cnt + zeroCnt < 5) max = 3;
        else if (cnt + zeroCnt < 6) max = 2;
        else max = 1;

        return new int[]{max, min};
    }
}
