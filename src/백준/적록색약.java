package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

// 백준 10026번 적록색약
class 적록색약 {
    static char[][] arr;
    static boolean visit[][];
    static int n;
    static int dx[] = {-1, 0, 0, 1};
    static int dy[] = {0, 1, -1, 0};

    public static void dfs(int x, int y) {
        visit[x][y] = true;
        char temp = arr[x][y];
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx > n || ny > n) {
                continue;
            }
            if (!visit[nx][ny] && arr[nx][ny] == temp) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new char[n + 1][n + 1];
        visit = new boolean[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            char[] input = br.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                arr[i][j] = input[j];
            }
        }

        // 정상
        int cnt = 0;
        cnt = dfsCnt(cnt);

        int normal_cnt = cnt;
        cnt = 0;
        visit = new boolean[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 'G') {
                    arr[i][j] = 'R';
                }
            }
        }

        cnt = dfsCnt(cnt);

        int abnormal_cnt = cnt;
        System.out.println(normal_cnt + " " + abnormal_cnt);
    }

    public static int dfsCnt(int cnt) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}