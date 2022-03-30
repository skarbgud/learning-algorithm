package codility.lesson4;

public class MaxCounters {
    public static void main(String[] args) {
        MaxCounters m = new MaxCounters();
        m.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
    }

    public int[] solution(int N, int[] A) {
        int[] counter = new int[N];
        int max = 0; // increase 할 때 최대값을 저장할 변수
        int globalMax = 0; // max 연산할때 max 값을 담을 변수
        for (int i = 0; i < A.length; i++) {
            // 주어진 값이 N+1과 같으면 해당 인덱스의 값은
            if (A[i] == N + 1) {
                globalMax = max; // 다음 회차때를 위한 최대값 저장
            } else {
                counter[A[i] - 1] = Math.max(globalMax, counter[A[i] - 1]) + 1; // 카운트 1씩 증가
                max = Math.max(max, counter[A[i] - 1]); // 현재의 최대값 저장
            }
        }
        for (int i = 0; i < counter.length; i++) {
            counter[i] = Math.max(counter[i], globalMax); // 최대값으로 세팅이 되지 않은곳을 최대값으로 세팅
        }
        return counter;
    }
}
