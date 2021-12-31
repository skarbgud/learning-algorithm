package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 2581번 소수
class 소수 {
    public static boolean prime[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        prime = new boolean[N + 1];

        get_prime();

        // 소수 합 및 최소값
        int sum = 0;
        int min = 0;
        for (int i = M; i <= N; i++) {
            if (prime[i] == false) {
                sum += i;
                if (min == 0) {
                    min = i;
                }
            }
        }
        if (sum == 0) { // 소수 없는 경우
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    // 에라토스테네스의 체
    public static void get_prime() {
        prime[0] = true;
        prime[1] = true;

        // true로 만들어서 false인 값들은 소수다.
        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}