package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 9095번 1, 2, 3 더하기
class BOJ_123더하기 {
    static int[] dp = new int[11];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < 11; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }

        StringBuilder sb = new StringBuilder();
        while (t > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n]).append('\n');
            t--;
        }
        System.out.println(sb);
    }
}