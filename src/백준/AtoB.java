package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 16953번 A → B
class AtoB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 1;

        while (a != b) {
            if (b < a) {
                cnt = -1;
                break;
            }
            if (b % 10 == 1) {
                b /= 10;
            } else if (b % 2 == 0) {
                b /= 2;
            } else {
                cnt = -1;
                break;
            }
            cnt++;
        }
        System.out.println(cnt == -1 ? -1 : cnt);
    }
}
