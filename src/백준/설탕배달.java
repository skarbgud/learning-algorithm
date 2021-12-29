package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 백준 2839번 설탕배달
class 설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();

        int count = 0;

        if (n == 4 || n == 7) {
            count = -1;
        } else if (n % 5 == 0) {
            count = n / 5;
        } else if ((n % 5) == 1 || (n % 5) == 3) {
            count = (n / 5) + 1;
        } else if (n % 5 == 2 || n % 5 == 4) {
            count = (n / 5) + 2;
        }

        System.out.println(count);
    }
}