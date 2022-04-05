package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 9461번 파도반 수열
class 파도반수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        long[] dp = new long[101];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 5; j <= n; j++) {
                dp[j] = dp[j - 2] + dp[j - 3];
            }
            System.out.println(dp[n]);
        }
    }
}