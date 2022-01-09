package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 1436번 영화감독 숌
class 영화감독숌 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int answer = 0;

        while (true) {
            answer++;
            String str = Integer.toString(answer);

            // 계속 더하다가 666이 있는경우 count 증가
            if (str.contains("666")) {
                count++;
            }
            // 입력 값과 count 값이 같으면 멈춘다
            if (count == n) {
                break;
            }
        }
        System.out.println(answer);
    }
}