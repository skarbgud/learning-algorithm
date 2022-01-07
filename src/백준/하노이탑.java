package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 11729번 하노이탑
class 하노이탑 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 옮긴 횟수 (2의 n 제곱 -1)
        sb.append((int) Math.pow(2, n) - 1).append('\n');

        Hanoi(n, 1, 2, 3);
        System.out.println(sb);
    }

    /*
        n: 원판의 개수
        start: 출발지
        mid: 옮기기 위해 이동해야하는 장소
        to: 목적지
     */
    public static void Hanoi(int n, int start, int mid, int to) {
        // 이동할 원반의 수가 1개라면
        if (n == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }
        // STEP 1: n - 1개를 A에서 B로 이동
        Hanoi(n - 1, start, to, mid);

        // STEP 2: 1개를 A에서 C로 이동
        sb.append(start + " " + to + "\n");

        // STEP 3: n-1개를 B에서 C로 이동
        Hanoi(n - 1, mid, start, to);

    }
}