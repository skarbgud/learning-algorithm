package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 백준 2749번 피보나치 수 3
class 피보나치수3 {
    static long[] fibo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int mod = 1000000;
        int period = mod / 10 * 15;
        fibo = new long[period];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < period; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            fibo[i] = fibo[i] % mod;
        }

        int index = (int) (n % period);
        System.out.println(fibo[index]);
    }
}