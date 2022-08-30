import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 백준 14502번 최단경로
class Main {
    // 바이러스 객체
    static class virus {
        int x, y;

        public virus(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n, m;
    static int[][] map;
    static int[][] copy_map;

    static int[] dr = {-1, 1, 0, 0}; // 상하좌우
    static int[] dc = {0, 0, -1, 1}; // 상하좌우

    static int result = Integer.MIN_VALUE; // 안전지역 개수

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        copy_map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        copy_map = map;

        dfs(0);

        System.out.println(result);
    }

    //벽세우기
    public static void dfs(int depth) {
        if (depth == 3) {
            bfs();
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    dfs(depth + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    public static void bfs() {
        int[][] virus_map = new int[n][m];
        Queue<virus> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                virus_map[i][j] = map[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 바이러스라면
                if (virus_map[i][j] == 2) {
                    queue.add(new virus(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            virus v = queue.remove();

            for (int d = 0; d < 4; d++) {
                int nr = v.x + dr[d];
                int nc = v.y + dc[d];

                if (nr >= 0 && nc >= 0 && nr < n && nc < m) {
                    if (virus_map[nr][nc] == 0) {
                        virus_map[nr][nc] = 2;
                        queue.add(new virus(nr, nc));
                    }
                }
            }
        }
        safe(virus_map);
    }

    private static void safe(int[][] virus_map) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (virus_map[i][j] == 0) {
                    count++;
                }
            }
        }
        result = Math.max(count, result);
    }
}