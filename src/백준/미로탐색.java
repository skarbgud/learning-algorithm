package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

// 백준 2178번 미로 탐색
class 미로탐색 {

    static int n, m;
    static int[][] graph;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0}; // x방향 배열-상하
    static int[] dy = {0, 0, -1, 1}; // y방향 배열-좌우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = s.charAt(j) - '0';
            }
        }
        visit = new boolean[n][m];
        visit[0][0] = true;
        dfs(0, 0);
        System.out.println(graph[n-1][m-1]);
    }

    private static void dfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] position = queue.poll();

            int px = position[0];
            int py = position[1];

            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                if (nx < 0 || ny < 0 || nx >= n ||  ny >= m) {
                    continue;
                }
                if (visit[nx][ny] || graph[nx][ny] == 0) {
                    continue;
                }
                queue.add(new int[] {nx, ny});
                graph[nx][ny] = graph[px][py] + 1;
                visit[nx][ny] = true;
            }
        }
    }
}