package 백준;

import java.util.Scanner;

// 백준 15651번 N과M (3)
class N과M3 {
    static int[] arr;
    static int n, m;
    static StringBuilder sb = new StringBuilder();

    private static void dfs(int depth) {
        if (depth == m) {
            for (int x : arr) {
                sb.append(x).append(' ');
            }
            sb.append('\n');
            return;
        } else {
            for (int i = 1; i <= n; i++) {
                arr[depth] = i;
                dfs(depth+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        dfs(0);
        System.out.println(sb);
    }
}