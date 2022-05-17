package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 15654번 N과 M (5)
class N과M5 {
    static int n, m;
    static int[] num;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        num = new int[n];
        arr = new int[n];
        visit = new boolean[n];

        st = new StringTokenizer(br.readLine() + " ");
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        dfs(0);
        System.out.println(sb.toString());
    }

    private static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append('\n');
            return;
        } else {
            for (int i = 0; i < n; i++) {
                // 방문 하지 않았다면
                if (!visit[i]) {
                    visit[i] = true;
                    arr[depth] = num[i];
                    dfs(depth + 1);
                    visit[i] = false;
                }
            }
        }
    }
}