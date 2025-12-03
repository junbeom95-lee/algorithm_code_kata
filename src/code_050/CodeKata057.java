package code_050;

import java.util.ArrayList;
import java.util.List;

public class CodeKata057 {  //모의고사완전탐색

    public int[] solution(int[] answers) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int aCnt = 0;
        int bCnt = 0;
        int cCnt = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) aCnt++;
            if (answers[i] == b[i % b.length]) bCnt++;
            if (answers[i] == c[i % c.length]) cCnt++;
        }

        int maxCnt = Math.max(aCnt, Math.max(bCnt, cCnt));

        List<Integer> answer = new ArrayList<>();

        if (aCnt == maxCnt) answer.add(1);
        if (bCnt == maxCnt) answer.add(2);
        if (cCnt == maxCnt) answer.add(3);

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution_fail(int[] answers) { //틀린 정답
        //AI 코드카타 피드백
        //사용자의 코드에서 문제가 되는 부분은 수포자들이 찍는 방식의 인덱스를 모두 잘못 관리하고 있다는 점입니다.
        // 현재 코드에서는 각 수포자들의 인덱스를 확인할 때, 마지막 인덱스에 도달하면 0으로 되돌리는 로직이 있지만,
        // 이 조건이 정확하지 않습니다. 각 배열의 길이에 대한 조건이 아니라 인덱스 증가에 따라 매번 원래 배열의 길이와 비교하여야 합니다.
        //
        //히트포인트:
        //1. **인덱스 관리**: 각 수포자의 배열 길이에 따라 인덱스를 계산할 필요가 있습니다. 예를 들어, 수포자 1은 5개의 문제를 반복하므로 `i % a.length`를 사용해야 합니다.
        //2. **문제의 조건 반복**: 기존의 조건문에서 -1이 되기 전에 배열 끝에 도달했는지를 정확하게 체크해야 합니다. 따라서 `j`, `k`, `l`의 조건은 필요하지 않고, 인덱스는 `i %` 연산으로 충분합니다.
        //3. **결과 정리**: 모든 수포자의 점수를 비교할 때 최대 점수를 가진 사람들을 찾는 부분은 잘 작성되었습니다. 다만 애초에 점수를 제대로 계산하지 않으면 의미가 없겠죠.

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int aCnt = 0;
        int bCnt = 0;
        int cCnt = 0;

        int j = 0;
        int k = 0;
        int l = 0;

        for (int i = 0; i < answers.length; i++) {
            if (j >= a.length - 1) j = 0;
            if (k >= b.length - 1) k = 0;
            if (l >= c.length - 1) l = 0;

            if (answers[i] == a[j]) aCnt++;
            if (answers[i] == b[k]) bCnt++;
            if (answers[i] == c[l]) cCnt++;
            j++; k++; l++;
        }

        int maxCnt = Math.max(aCnt, Math.max(bCnt, cCnt));

        List<Integer> answer = new ArrayList<>();

        if (aCnt == maxCnt) answer.add(1);
        if (bCnt == maxCnt) answer.add(2);
        if (cCnt == maxCnt) answer.add(3);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
