package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 2475번 검증수
class 검증수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() + " ");
        br.close();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int k = Integer.parseInt(st.nextToken());
            sum += k * k;
        }

        System.out.println(sum % 10);
    }
}