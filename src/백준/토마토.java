package 백준;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
  public int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

// 백준 7576번 토마토
class 토마토 {

  static int n, m;
  static int[] dx = { -1, 0, 1, 0 };
  static int[] dy = { 0, 1, 0, -1 };
  static int[][] arr;
  static int[][] dis;
  static Queue<Point> queue = new LinkedList<>();

  public static void bfs() {
    while (!queue.isEmpty()) {
      Point p = queue.poll();
      for (int i = 0; i < 4; i++) {
        int nx = p.x + dx[i];
        int ny = p.y + dy[i];
        if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0) {
          arr[nx][ny] = 1;
          queue.offer(new Point(nx, ny));
          dis[nx][ny] = dis[p.x][p.y] + 1;
        }
      }
    }
  }

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    m = sc.nextInt();
    n = sc.nextInt();

    arr = new int[n][m];
    dis = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = sc.nextInt();
        if (arr[i][j] == 1) {
					// BFS의 Queue (0레벨 세팅)
					queue.offer(new Point(i, j));
				}
      }
    }
    sc.close();
    bfs();
    boolean flag = true;
    int answer = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr[i][j] == 0) {
          flag = false;
        }
      }
    }
    if (flag) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          answer = Math.max(answer, dis[i][j]);
        }
      }
      System.out.println(answer);
    } else {
      System.out.println(-1);
    }
  }
}