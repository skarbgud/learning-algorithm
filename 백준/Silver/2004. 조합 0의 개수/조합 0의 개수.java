import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

// 백준 2004번 조합 0의 개수
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine() + " ");

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        // 각각의 승수를 구한다.
        long count5 = five_n(n) - five_n(n - m) - five_n(m);
        long count2 = two_n(n) - two_n(n - m) - two_n(m);
        System.out.println(Math.min(count5, count2));
    }

    private static long two_n(long n) {
        int count = 0;
        while (n >= 5) {
            count += (n / 5);
            n /= 5;
        }
        return count;
    }

    private static long five_n(long n) {
        int count = 0;
        while (n >= 2) {
            count += (n / 2);
            n /= 2;
        }
        return count;
    }
}