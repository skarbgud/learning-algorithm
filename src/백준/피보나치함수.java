package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 1003번 좌표 압축
class 피보나치함수 {

    static int cnt_zero = 0;
    static int cnt_one = 0;

    public static void fibonacci(int n) {
        int temp1 = 0;
        int temp2 = 1;
        int temp = 0;

        if (n == 0) {
            cnt_zero++;
            return;
        } else if (n == 1) {
            cnt_one++;
            return;
        } else if (n < 0) {
            return;
        }
        else {
            for (int i = 1; i < n; i++) {
                temp = temp1 + temp2;
                temp1 = temp2;
                temp2 = temp;
            }
            cnt_zero = temp1;
            cnt_one = temp2;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            fibonacci(Integer.parseInt(br.readLine()));
            sb.append(cnt_zero).append(" ").append(cnt_one).append('\n');
            cnt_zero = cnt_one = 0;
        }
        System.out.println(sb);
    }
}