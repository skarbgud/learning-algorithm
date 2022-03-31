package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 1676번 팩토리얼 0의 개수
class 팩토리얼0의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        // 팩토리얼값을 소인수분해시 5가 사용된 개수만큼 0이 존재
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        System.out.println(count);
    }
}