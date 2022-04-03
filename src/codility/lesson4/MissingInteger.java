package codility.lesson4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public static void main(String[] args) {
        MissingInteger t = new MissingInteger();
        System.out.println(t.solution(new int[]{1, 2, 3}));
    }

    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(A);
        int max = A[A.length-1];
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        for (int i = 1; i <= max+1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 1;
    }
}
