package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 10250번 ACM 호텔
class ACM호텔 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine() + " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            // 층 수 구하기
            int y = h * 100;
            if (n % h != 0) {
                y = (n % h) * 100;
            }
            // 호 수 구하기
            int x = n / h;
            if (n % h != 0) {
                x = (n / h) + 1; // 1부터 시작하기 때문에 아닌경우에만 +1
            }
            System.out.println(y + x);
        }
    }
}