import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] s = new long[n]; //구간합 배열
        long[] c = new long[m]; //같은 나머지의 인덱스를 카운트하는 배열
        long answer = 0;

        st = new StringTokenizer(br.readLine());
        s[0] = Integer.parseInt(st.nextToken());

        // 구간합 세팅
        for (int i = 1; i < n; i++) {
            s[i] = s[i-1] + Integer.parseInt(st.nextToken());
        }
        // 구간합의 나머지 세팅
        for (int i = 0; i < n; i++) {
            int remain = (int) (s[i] % m);
            // 0이면 나누어 떨어지는 그 구간합의 자체까지가 하나의 나누어 떨어지는 구간
            if (remain == 0) {
                answer++;
            }
            // 나머지가 같은 인덱스 카운팅
            c[remain]++;
        }

        for (int i = 0; i < m; i++) {
            // 카운팅된게 있다면
            if (c[i] > 1) {
                // 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수 더하기
                answer = answer + (c[i] * (c[i] - 1) / 2);
            }
        }
        System.out.println(answer);
    }
}