package 백준;

import java.util.*;


// 백준 11724번 연결 요소의 개수
class 연결요소의개수 {
    static int n, m, cnt = 0;
    static int[][] graph;
    static int[] ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if (ch[i] != 1) {
                DFS(i);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static void DFS(int depth) {
        if (ch[depth] == 1) {
            return;
        } else {
            ch[depth] = 1;
            for (int i = 1; i <= n; i++) {
                if (graph[depth][i] == 1) {
                    DFS(i);
                }
            }
        }
    }
}