package 백준;

import java.util.Scanner;

// 백준 1074번 Z
public class Z {
    static int N, r, c, cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();

        int boardSize = (int) Math.pow(2, N);
        solution(boardSize, 0, 0);
    }

    static void solution(int n, int y, int x) {
        if (y == r && x == c) {
            System.out.println(cnt);
            System.exit(0);
        }

        if (y <= r && r < (y + n) && x <= c && c < (x + n)) {
            int nn = n / 2;
            solution(nn, y, x);
            solution(nn, y, x + nn);
            solution(nn, y + nn, x);
            solution(nn, y + nn, x + nn);
        } else
            cnt += n * n;
    }
}