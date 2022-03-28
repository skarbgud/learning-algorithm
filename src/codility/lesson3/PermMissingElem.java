package codility.lesson3;

import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A) {
        // 오름차순으로 정렬
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            // 정렬된 상태에서 i+1과 같이 다른값이면 해당 값이 빈값이므로 해당 값을 반환한다.
            if (A[i] != i + 1) {
                return i + 1;
            }
        }
        return A.length + 1;
    }
}
