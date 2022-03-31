package 백준;

import java.math.BigInteger;
import java.util.Scanner;

// 백준 1793번 타일링
class 타일링 {
    static BigInteger[] dp = new BigInteger[251];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dp[1] = BigInteger.valueOf(1);
        dp[2] = BigInteger.valueOf(3);

        for (int i = 3; i <= 250; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2].multiply(BigInteger.valueOf(2)));
        }

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}