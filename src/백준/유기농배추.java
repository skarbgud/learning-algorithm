package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 백준 1012번 유기농배추
class 유기농배추 {
    static int n, m, k, count;
    static int[][] board;
    static boolean[][] visit;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            x = queue.peek()[0];
            y = queue.peek()[1];
            visit[x][y] = true;
            queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    if (!visit[nx][ny] && board[nx][ny] == 1) {
                        queue.add(new int[]{nx, ny});
                        visit[nx][ny] = true;
                        board[nx][ny] = 1;
                    }
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int c = 0; c < t; c++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 가로
            m = Integer.parseInt(st.nextToken());
            // 세로
            n = Integer.parseInt(st.nextToken());
            // 배추 개수
            k = Integer.parseInt(st.nextToken());
            board = new int[m][n];
            visit = new boolean[m][n];
            count = 0;

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                board[x][y] = 1;
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 1 && !visit[i][j]) {
                        bfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}