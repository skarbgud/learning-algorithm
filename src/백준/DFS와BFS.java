package 백준;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준 1260번 DFS와BFS
class DFS와BFS {

  static int[][] arr;
  static boolean[] visited;

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); // 정점의 개수
    int m = sc.nextInt(); // 간선의 개수
    int v = sc.nextInt(); // 탐색을 시작할 정점 번호

    arr = new int[n + 1][n + 1];
    for (int i = 0; i < m; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      arr[x][y] = 1;
      arr[y][x] = 1;
    }
    sc.close();

    visited = new boolean[n + 1];
    dfs(v);
    System.out.println();
    visited = new boolean[n + 1];
    bfs(v);
  }

  public static void dfs(int v) {
    visited[v] = true;
    System.out.print(v + " ");
    if (v == arr.length) {
      return;
    } else {
      for (int i = 1; i < arr.length; i++) {
        // 연결되어있는데 방문하지않았다면 재귀
        if (arr[v][i] == 1 && visited[i] == false) {
          dfs(i);
        }
      }
    }
  }

  public static void bfs(int v) {
    Queue<Integer> queue = new LinkedList<>();

    queue.add(v);
    visited[v] = true;
    System.out.print(v + " ");

    while (!queue.isEmpty()) {
      int temp = queue.poll();
      for (int i = 1; i < arr.length; i++) {
        if (arr[temp][i] == 1 && visited[i] == false) {
          queue.add(i);
          visited[i] = true;
          System.out.print(i + " ");
        }
      }
    }
  }
}