package 백준;

import java.util.Scanner;

// 백준 2606번 바이러스
class 바이러스 {
    static int cnt = 0; // 감염시킨 컴퓨터의 수

    public static void dfs(int[][] a, boolean[] check, int v) {
        if (check[v] == true) {
            return; // 재귀 호출 종료
        } else {
            check[v] = true; // 방문 처리
            cnt++; // 감염된 컴퓨터 수 증가, 최초 방문 컴퓨터 포함

            for (int i = 0; i < a[v].length; i++) { // 인접 행렬 탐색
                if (a[v][i] == 1 && !check[i]) { // 연결된 정점이면서 방문하지 않은경우
                    dfs(a, check, i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = sc.nextInt();

        int[][] a = new int[n + 1][n + 1];
        boolean[] check = new boolean[n + 1];

        for (int i = 0; i < e; i++) {
            int com1 = sc.nextInt();
            int com2 = sc.nextInt();
            a[com1][com2] = 1;
            a[com2][com1] = 1;
        }

        dfs(a, check, 1);

        System.out.println(cnt - 1); // 1번 컴퓨터는 제외해야하므로 -1
    }
}