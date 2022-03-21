package 백준;

import java.util.Scanner;

// 백준 15650번 N과M (2)
class N과M2 {
    static int[] arr;
    static int n, m;

    private static void dfs(int at, int depth) {
        if (depth == m) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
            return;
        } else {
            for (int i = at; i <= n; i++) {
                arr[depth] = i;
                dfs(i+1, depth+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        dfs(1, 0);
    }
}