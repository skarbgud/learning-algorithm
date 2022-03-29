package codility.lesson4;

import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {
        int answer = 1;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            // 정렬후 해당 인덱스값의 + 1의 값이 아니면 0
            if (A[i] != i + 1) {
                answer = 0;
                break;
            }
        }
        return answer;
    }
}
