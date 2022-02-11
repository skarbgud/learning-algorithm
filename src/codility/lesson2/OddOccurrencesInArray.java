package codility.lesson2;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        System.out.println(oddOccurrencesInArray.solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int answer = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}
