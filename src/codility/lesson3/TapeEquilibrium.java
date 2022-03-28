package codility.lesson3;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int sum = 0;
        for (int x : A) {
            sum += x;
        }
        // 범위 -1000 ~ 1000
        int min = 2000;
        // left -> 좌측값의 합계
        int left = 0;
        for (int i = 1; i < A.length; i++) {
            // 누적 좌측값
            left += A[i - 1];
            // 좌측값 - 우측값의 절대값
            int value = Math.abs(left - (sum - left));
            // 절대값 중 가장 작은 값
            if (min > value) {
                min = value;
            }
        }
        return min;
    }
}
