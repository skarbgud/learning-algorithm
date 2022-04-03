package codility.lesson5;

public class PassingCars {
    public int solution(int[] A) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                sum++;
            } else {
                answer += sum;
            }
        }
        if (answer > 1000000000 || answer < 0) {
            return -1;
        }
        return answer;
    }
}
