package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 6064번 카잉 달력
class 카잉달력 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine() + " ");

            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            boolean flag = false;

            // x가 m씩 증가할때마다 x값은 동일하고 y만 변한다
            // y가 n씩 증가할때마다 y값은 동일하고 x만 변한다
            // m = 5, n = 7, x = 4, y = 5 일경우
            // 19 % 5 = 4
            // 19 % 7 = 5
            // 나머지 연산을 통해 19번째의 숫자임을 알 수 있다.
            /*for (int j = 0; j < m * n; j++) {
                if (j % m == x && j % n == y) {
                    System.out.println(j);
                    flag = true;
                    break;
                }                                     ==> 시간 초과
            }*/

            // x부터 m씩 증가하면서 나머지의 값이 y와 같은 값
            for (int j = x; j < m * n; j += m) {
                if (j % n == y) {
                    System.out.println(j + 1); // 나머지값이 0이 나오는 경우를 위해 +1
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(-1);
            }
        }
    }
}