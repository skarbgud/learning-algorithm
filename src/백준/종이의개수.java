package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 1780번 종이의개수
class 종이의개수 {
    static int n;
    static int[][] board;
    static int[] count = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0,0,n);
        System.out.println(count[0]);
        System.out.println(count[1]);
        System.out.println(count[2]);
    }

    private static void divide(int row, int col, int n) {
        if (check(row,col,n)) {
            count[board[row][col]+1]++;
        } else {
            int s = n / 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    divide(row + s * i, col + s * j, s);
                }
            }
        }
    }

    private static boolean check(int row, int col, int n) {
        int std = board[row][col];
        for (int i = row; i < row + n; i++) {
            for (int j = col; j < col + n; j++) {
                if (std != board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}