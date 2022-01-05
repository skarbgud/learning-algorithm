package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 10870번 피보나치 수 5
class 피보나치수5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(Fibonacci(n));

    }

    public static int Fibonacci(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return Fibonacci(n-1) + Fibonacci(n - 2);
    }
}