package 백준;

import java.util.Scanner;

// 백준 15652번 N과M (4)
class N과M4 {
    static int[] arr;
    static int n, m;
    static StringBuilder sb = new StringBuilder();

    private static void dfs(int at, int depth) {
        if (depth == m) {
            for (int x : arr) {
                sb.append(x).append(' ');
            }
            sb.append('\n');
            return;
        } else {
            for (int i = at; i <= n; i++) {
                arr[depth] = i;
                dfs(i,depth+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        dfs(1,0);
        System.out.println(sb);
    }
}