package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 2292번 벌집
class 벌집 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();

        int count = 1; // 겹 수 (최소 루트) - 시작점과 끝점 포함이니 1로 시작
        int range = 2; // 범위 (최솟값 기준)

        if (n == 1) {
            System.out.println(1);
        } else {
            while (range <= n) { //범위가 N보다 커지기 전까지 반복
                range = range + (6 * count); // 다음 최솟값으로 초기화
                count++; // count 1증가
            }
            System.out.println(count);
        }
    }
}