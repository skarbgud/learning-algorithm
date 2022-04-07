package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 백준 13023번 ABCDE
class ABCDE {
    static boolean isLink = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.get(a).add(b);
            arr.get(b).add(a);
        }

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            dfs(i, arr, visited, 1);
            if (isLink) {
                break;
            }
        }

        if (isLink) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static void dfs(int i, ArrayList<ArrayList<Integer>> arr, boolean[] visited, int depth) {
        if (depth == 5) {
            isLink = true;
            return;
        }
        visited[i] = true;
        for (int index : arr.get(i)) {
            if (!visited[index]) {
                dfs(index, arr, visited, depth + 1);
            }
            if (isLink) {
                return;
            }
        }
        visited[i] = false;
    }
}