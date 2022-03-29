package codility.lesson4;

import java.util.*;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            // X의 값보다 작은 값들을 Set 에 담는다
            if (A[i] <= X) {
                set.add(A[i]);
            }
            // set의 사이즈가 X와 같다면 Set 에 모든 값이 담겼으니 해당 인덱스를 리턴한다.
            if (set.size() == X) {
                return i;
            }
        }
        return -1;
    }
}
