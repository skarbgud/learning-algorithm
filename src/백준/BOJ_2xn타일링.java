package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 11726번 2×n 타일링
class BOJ_2xn타일링 {
    static int[] dp = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 4;
        for (int i = 4; i <= n; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % 10007;
        }
        System.out.println(dp[n] % 10007);
    }
}