package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 2579번 계단 오르기
class 계단오르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] stair = new int[301];
        int[] dp = new int[301];

        for (int i = 1; i <= n; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = stair[1];
        dp[2] = stair[1] + stair[2];
        dp[3] = Math.max(stair[1], stair[2]) + stair[3];

        for (int i = 4; i <= n; i++) {
            dp[i] = Math.max(dp[i - 3] + stair[i - 1] + stair[i], dp[i - 2] + stair[i]);
        }

        System.out.println(dp[n]);
    }
}