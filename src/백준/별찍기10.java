package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 백준 2447번 별찍기 - 10
class 별찍기10 {

    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], ' ');
        }

        star(0, 0, n);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public static void star(int x, int y, int n) {

        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        int m = n / 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                star(m * i + x, m * j + y, m);
            }
        }
    }
}