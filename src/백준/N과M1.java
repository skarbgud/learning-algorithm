package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 15649번 N과M (1)
class N과M1 {
    static int n, m;
    static boolean[] visit;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() + " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visit = new boolean[n];
        arr = new int[m];
        dfs(0);
    }

    private static void dfs(int depth) {
        if (depth == m) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
            return;
        } else {
            for (int i = 0; i < n; i++) {
                if (visit[i] == false) {
                    visit[i] = true;
                    arr[depth] = i + 1;
                    dfs(depth+1);
                    visit[i] = false;
                }
            }
        }
    }
}