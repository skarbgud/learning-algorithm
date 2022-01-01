package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 1929번 소수구하기
class Main {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        prime = new boolean[N+1];
        get_prime();

        StringBuilder sb = new StringBuilder();

        for (int i = M; i <= N; i++) {
            // false = 소수
            if (!prime[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.print(sb);
    }

    public static void get_prime() {
        // true = 소수아님, false = 소수
        prime[0] = prime[1] = true;

        // 제곱근범위까지 i범위
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            // 이미 체크된 배열이면 다음 반복문으로 skip
            if(prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) { // i 배수 제거
                // 제곱이 가능 할 경우 true => 소수아님
                prime[j] = true;
            }
        }
    }
}