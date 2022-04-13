package 백준;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Board {
    public int x, y, z;

    public Board(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

// 백준 7569번 토마토
class 토마토2 {

    static int n, m, h;
    static int[] dx = {-1, 0, 1, 0, 0, 0};
    static int[] dy = {0, 1, 0, -1, 0, 0};

    static int[] dz = {0, 0, 0, 0, 1, -1};
    static int[][][] arr;
    static int[][][] dis;
    static Queue<Board> queue = new LinkedList<>();

    public static int bfs() {
        while (!queue.isEmpty()) {
            Board b = queue.poll();
            for (int i = 0; i < 6; i++) {
                int nx = b.x + dx[i];
                int ny = b.y + dy[i];
                int nz = b.z + dz[i];

                if (nx >= 0 && nx < h && ny >= 0 && ny < n && nz < m && nz >= 0 && arr[nx][ny][nz] == 0) {
                    if (dis[nx][ny][nz] == 0) {
                        queue.offer(new Board(nx, ny, nz));
                        dis[nx][ny][nz] = dis[b.x][b.y][b.z] + 1;
                    }
                }
            }
        }

        int result = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (result < dis[i][j][k])
                        result = dis[i][j][k];
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (arr[i][j][k] == 0 && dis[i][j][k] == 0) {
                        result = -1;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        h = sc.nextInt();

        arr = new int[h][n][m];
        dis = new int[h][n][m];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr[i][j][k] = sc.nextInt();
                    if (arr[i][j][k] == 1) {
                        queue.offer(new Board(i, j, k));
                    }
                }
            }
        }
        sc.close();
        System.out.println(bfs());
    }
}