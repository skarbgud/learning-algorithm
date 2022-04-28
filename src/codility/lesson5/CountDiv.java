package codility.lesson5;

public class CountDiv {
    public int solution(int A, int B, int K) {
        /* 50%
        int cnt = 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                cnt++;
            }
        }
        return cnt;
        */

        // A와 B 사이에 나눌 수 있는 수 [값/K = 나눌수 있는 수]
        int cnt = B / K - A / K;
        // A가 K로 나눌수 있는지에 대한 여부 체크 => 나눌수 있다면 +1개의 값을 반환하고 아니라면 해당 범위의 값을 구해서 리턴
        return A % K == 0 ? cnt + 1 : cnt;
    }
}
